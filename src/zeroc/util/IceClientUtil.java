/**
 * <p>title:IceClientUtil.java<／p>
 * <p>Description: <／p>
 * @date:2016年5月16日上午10:25:17
 * @author：ZhongwengHao email:zhongweng.hao@qq.com
 * @version 1.0
 */
package zeroc.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import Ice.ObjectPrx;

/**  
 * 创建时间：2016年5月16日 上午10:25:17  
 * 项目名称：DUCRPC   
 * 文件名称：IceClientUtil.java  
 * 类说明：  
 *
 * Modification History:   
 * Date        Author         Version      Description   
 * ----------------------------------------------------------------- 
 * 2016年5月16日     Zhongweng       1.0         1.0 Version   
 */
/**
 * <p>
 * Title: IceClientUtil<／p>
 * <p>
 * Description: <／p>
 * 
 * @author ZhongwengHao
 * @date 2016年5月16日
 */
public class IceClientUtil {
	//重量级全局变量
	private static volatile Ice.Communicator ic = null;
	//缓存prox
	private static Map<Class<?>, ObjectPrx> cls2PrxMap = new HashMap<Class<?>, ObjectPrx>();//
	//时间戳
	private static volatile long lastAccessTimestamp;//
	//守护线程
	private static volatile MonitorThread monitorThread;//
	//空闲超时时间
	private static long idleTimeOutSeconds = 0;
	//server addr
	//private static String iceLocator = null;
	private static final String locatorKey = "--Ice.Default.Locator";

	
	/**
	 * <p>Title: init<／p>
	 * <p>Description: <／p>
	 * @param locateStr:使用Grid时启用
	 * @param idleTime: 空闲释放资源时间 单位:秒
	 * @return
	 */
	public static boolean init(long idleTime){
		//iceLocator = new String(locateStr);
		idleTimeOutSeconds = idleTime;
		return true;
	}
	
	/**
	 * <p>
	 * Title: getIceCommunicator<／p>
	 * <p>
	 * Description: 得到通讯ice communicator<／p>
	 * 
	 * @return
	 */
	private static Ice.Communicator getIceCommunicator() {
		if (ic == null) {
			synchronized (IceClientUtil.class) {
				if (ic == null) {
					//if (iceLocator == null) {
//						ResourceBundle rb = ResourceBundle.getBundle(
//								"iceclient", Locale.ENGLISH);
//						iceLocator = rb.getString(locatorKey);
//						idleTimeOutSeconds = Integer.parseInt(rb
//								.getString("idleTimeOutSeconds"));
//						System.out.println("Ice client`s locator is "
//								+ iceLocator
//								+ " proxy cache time out seconds :"
//								+ idleTimeOutSeconds);
//						throw new java.lang.IllegalArgumentException(
//								"no iceLocator,please init first!");
					//}
//					String[] initParams = new String[] { locatorKey + "="
//							+ iceLocator };
					//ic = Ice.Util.initialize(initParams);//
					ic = Ice.Util.initialize();//
					createMonitorThread();
				}
			}
		}
		lastAccessTimestamp = System.currentTimeMillis();
		return ic;
	}


	/**
	 * <p>Title: createMonitorThread<／p>
	 * <p>Description: 创建守护线程 并 启动<／p>
	 */
	private static void createMonitorThread() {
		monitorThread = new MonitorThread();
		monitorThread.setDaemon(true);
		monitorThread.start();
	}


	/**
	 * <p>Title: closeCommunicator<／p>
	 * <p>Description: 
	 * 1 关闭ice communication 
	 * 2 中断 守护进程
	 * 3 清理缓存<／p>
	 * @param removeServiceCache
	 */
	public static void closeCommunicator(boolean removeServiceCache) {
		synchronized (IceClientUtil.class) {
			if (ic != null) {
				safeShutdown();
				monitorThread.interrupt();
				if (removeServiceCache && !cls2PrxMap.isEmpty()) {
					try {
						cls2PrxMap.clear();
					} catch (Exception e) {
						// ignore
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * <p>Title: safeShutdown<／p>
	 * <p>Description: <／p>
	 */
	private static void safeShutdown() {
		try {
			ic.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ic.destroy();
			ic = null;
		}
	}

	/**
	 * <p>Title: createIceProxy<／p>
	 * <p>Description:反射方式 创建ice 客户端 Proxy <／p>
	 * @param communicator
	 * @param serviceCls
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private static ObjectPrx createIceProxy(Ice.Communicator communicator,
			Class serviceCls, String addrServ) {
		ObjectPrx proxy = null;
		String clsName = serviceCls.getName();
		System.out.println("clsName:" + clsName);
		String serviceName = serviceCls.getSimpleName();
		int pos = serviceName.lastIndexOf("Prx");
		if (pos <= 0) {
			throw new java.lang.IllegalArgumentException(
					"Invalid ObjectPrx class ,class name must end with Prx");
		}
		String realSvName = serviceName.substring(0, pos);
		try {
			//Ice.ObjectPrx base = communicator.stringToProxy(realSvName);
			Ice.ObjectPrx base = communicator.stringToProxy(addrServ);
			System.out.println("realSvName:" + realSvName);
			proxy = (ObjectPrx) Class.forName(clsName + "Helper").newInstance();
			Method m1 = proxy.getClass().getDeclaredMethod("uncheckedCast",
					ObjectPrx.class);
			proxy = (ObjectPrx) m1.invoke(proxy, base);
			return proxy;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * <p>Title: getServicePrx<／p>
	 * <p>Description: 客户端API 获取ICE服务实例<／p>
	 * @param serviceCls
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static ObjectPrx getServicePrx(Class serviceCls, String addrServ) {
		ObjectPrx proxy = cls2PrxMap.get(serviceCls);
		if (proxy != null) {
			lastAccessTimestamp = System.currentTimeMillis();
			return proxy;
		}
		proxy = createIceProxy(getIceCommunicator(), serviceCls, addrServ);
		cls2PrxMap.put(serviceCls, proxy);
		lastAccessTimestamp = System.currentTimeMillis();
		return proxy;
	}

	/**
	 * <p>Title: MonitorThread<／p>
	 * <p>Description: <／p>
	 * @author ZhongwengHao
	 * @date 2016年5月16日
	 */
	static class MonitorThread extends Thread {
		public void run() {
			while (!Thread.currentThread().isInterrupted()) {
				try {
					Thread.sleep(10000L);
					if (lastAccessTimestamp + idleTimeOutSeconds * 1000L < System.currentTimeMillis()) {
						closeCommunicator(true);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
