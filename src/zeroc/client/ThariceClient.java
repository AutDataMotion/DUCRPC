/**
 * 
 */
package zeroc.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import Ice.StringSeqHolder;
import RPCRice.ClassifyA;
import RPCRice.ClassifyB;
import RPCRice.Drought;
import RPCRice.Growth;
import RPCRice.PreProcess;
import RPCRice.Yield;

/**
 * @author zhongweng
 *
 */

public class ThariceClient {
	public final static String serverAddr = "thairice:default -h 10.2.29.74 -p 8888";

	private static Ice.Communicator ic;
	private static Ice.ObjectPrx base;
	private static RPCRice.InfRicePrx proxy;

	private static Map<String, String> mapArgs;
	static {
		// initialize the Ice run time
		ic = Ice.Util.initialize(new String[] {});
		// obtain a proxy for the remote printer
		System.out.println("---client---start");
		base = ic.stringToProxy(serverAddr);
		proxy = RPCRice.InfRicePrxHelper.checkedCast(base);
		mapArgs = new HashMap<String, String>() {
			{
				put("argKey1", "value1");
				put("argKey2", "value2");
			}
		};
	}

	public static void main(String[] args) {
		int status = 0;
		try {
			if (proxy == null)
				throw new Error("Invalid proxy");
			CountDownLatch countDownLatch = new CountDownLatch(5);
			
			// ===============预处理
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					preProcessing();
					countDownLatch.countDown();
				}
			}).start();
			//=============== 面积监测
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					classifyArea();
					countDownLatch.countDown();
				}
			}).start();
			
			// ==============干旱监测
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					landDrought();
					countDownLatch.countDown();
				}
			}).start();
			// ==============长势监测
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					grouthMonitor();
					countDownLatch.countDown();
				}
			}).start();
			// ==============水稻估产
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					landYield();
					countDownLatch.countDown();
				}
			}).start();
			
			countDownLatch.await();
			System.out.println("所有任务全部完成");
		} catch (Ice.LocalException e) {
			e.printStackTrace();
			status = 1;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			status = 1;
		}
		if (ic != null) {
			// Clean up
			//
			try {
				ic.destroy();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				status = 1;
			}
		}
		System.exit(status);
	}

	public static void preProcessing() {
		// ===============预处理
		PreProcess argPreProcess = new PreProcess();
		argPreProcess.id = 1;
		argPreProcess.h26v06 = "D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h26v06.006.2017218051159.hdf";
		argPreProcess.h27v06 = "D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h27v06.006.2017218050132.hdf";
		argPreProcess.h27v07 = "D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h27v07.006.2017218045926.hdf";
		argPreProcess.h27v08 = "D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h27v08.006.2017218045323.hdf";
		argPreProcess.h28v07 = "D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h28v07.006.2017218050254.hdf";
		argPreProcess.h28v08 = "D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h28v08.006.2017218050332.hdf";
		argPreProcess.shpfile = "D:\\drought\\shp\\Thailand.shp";
		argPreProcess.outFile = "D:\\Preprocess\\result";

		String resPreProcess = proxy.PreProcessing(argPreProcess, mapArgs);
		System.out.println("RPC Res PreProcessing:" + resPreProcess);

	}

	public static void landDrought() {
		// ==============干旱监测
		Drought argDrought = new Drought();
		argDrought.id = 3;
		argDrought.fileDate = "2017209";
		argDrought.imageLst = "D:\\drought\\data\\Thailand_LST_2017209.tif";
		argDrought.imageNdvi = "D:\\drought\\data\\Thailand_NDVI_2017209.tif";
		argDrought.imageLanduse = "D:\\drought\\land\\ThailandAgriculturalLand_1km_N_n.tif";
		argDrought.shpfilelPath = "D:\\Thailand_test\\shp";
		argDrought.outPath = "D:\\Thailand_test\\drought";
		argDrought.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
		argDrought.threshold1 = 0.2f;
		argDrought.threshold2 = 0.4f;
		argDrought.threshold3 = 0.6f;
		argDrought.threshold4 = 0.8f;

		String landdrought = proxy.landdrought(argDrought, mapArgs);
		System.out.println("RPC  干旱监测 完成：返回结果:" + landdrought);

	}

	public static void classifyArea() {
		// ==============面积监测
		ClassifyA argClassifyA = new ClassifyA();
		argClassifyA.id = 1;
		argClassifyA.fileDate = "20140102";
		argClassifyA.imagePath = "D:\\classify\\data\\oli_20140102_22_Clip1.tif";
		argClassifyA.outCode = "72";
		argClassifyA.shpfilePath = "D:\\classify\\shp\\Thailand_SuphanburiProvince.shp";
		argClassifyA.lablePath = "D:\\classify\\lable2";
		argClassifyA.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
	
		String maxlikehood = proxy.maxlikehood(argClassifyA, mapArgs);
		System.out.println("RPC Res maxlikehood:" + maxlikehood);

		ClassifyB argClassifyB = new ClassifyB();
		argClassifyB.id = 1;
		argClassifyB.fileDate = "";
		argClassifyB.outCode = "72";
		argClassifyB.modClassShp = "D:\\Thailand_test\\preshp";
		String split = proxy.split(argClassifyB, mapArgs);
		System.out.println("RPC Res split:" + split);
	}

	public static void grouthMonitor() {
		// ==============长势监测
		Growth argGrowth = new Growth();
		argGrowth.id = 1;
		argGrowth.fileDate = "20180201";
		argGrowth.pathNdvi = "";
		argGrowth.imageLanduse = "D:\\grouth\\data\\Clip_N2_2017.tif";
		argGrowth.shpfilePath = "D:\\Thailand_test\\landuse";
		argGrowth.outPath = "D:\\Thailand_test\\grouth";
		argGrowth.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
		argGrowth.threshold1 = 2001;
		argGrowth.threshold2 = 2016;
		argGrowth.threshold3 = -0.3f;
		argGrowth.threshold4 = -0.1f;

		String resGrowth = proxy.GrowthMonitor(argGrowth, mapArgs);
		System.out.println("RPC  长势监测 完成, 返回结果：:" + resGrowth);
	}

	public static void landYield() {
		// ==============水稻估产
		Yield argYield = new Yield();
		argYield.id = 2;
		argYield.fileDate = "20170723";
		argYield.pathNdvi = "D:\\Thailand_test\\data\\Clip_N2_2017.tif";
		argYield.outCode = "72";
		argYield.pathStatistics = "D:\\yield\\yield4\\statistic\\Suphanburd.csv";
		argYield.imageLanduse = "D:\\yield\\yield4\\land\\Suphanburd_land_250p_N.tif";
		argYield.outPath = "D:\\Thailand_test\\yield";
		argYield.shpfilePath = "D:\\Thailand_test\\shp\\Province";
		argYield.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";

		 String landyield = proxy.landyield(argYield, mapArgs);
		 System.out.println("RPC Res landyield:" + landyield);
	}
}
