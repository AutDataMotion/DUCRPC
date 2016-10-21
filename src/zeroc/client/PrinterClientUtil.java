/**
 * <p>title:PrinterClientUtil.java<／p>
 * <p>Description: <／p>
 * @date:2016年5月18日上午10:27:49
 * @author：ZhongwengHao email:zhongweng.hao@qq.com
 * @version 1.0
 */
package zeroc.client;

import Demo.hello.PrinterPrx;
import zeroc.util.IceClientUtil;

/**  
 * 创建时间：2016年5月18日 上午10:27:49  
 * 项目名称：DUCRPC   
 * 文件名称：PrinterClientUtil.java  
 * 类说明：  
 *
 * Modification History:   
 * Date        Author         Version      Description   
 * ----------------------------------------------------------------- 
 * 2016年5月18日     Zhongweng       1.0         1.0 Version   
 */
/**
 * <p>Title: PrinterClientUtil<／p>
 * <p>Description: <／p>
 * @author ZhongwengHao
 * @date 2016年5月18日
 */
public class PrinterClientUtil {

	/**
	 * <p>Title: main<／p>
	 * <p>Description: <／p>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceClientUtil.init( 60);
		PrinterPrx printer = null;
		PrinterPrx printer2 = null;
		System.out.println("---client---start");
		try {
			printer = (PrinterPrx)IceClientUtil.getServicePrx(PrinterPrx.class, "SimplePrinter:default -p 1000");
			if (printer == null)
				throw new Error("Invalid proxy");
			for (int i = 0; i < 3; i++) {
				printer.printString("Hello World "+i);
			}
			Thread.sleep(3000L);
			printer2 = (PrinterPrx)IceClientUtil.getServicePrx(PrinterPrx.class, "SimplePrinter:default -p 1000");
			if (printer2 == null)
				throw new Error("Invalid proxy");
			for (int i = 0; i < 3; i++) {
				printer2.printString("------Hello World "+i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
		
	}

}
