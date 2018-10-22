/**
 * 
 */
package zeroc.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import RPCRice.ClassifyA;
import RPCRice.ClassifyB;
import RPCRice.Drought;
import RPCRice.Growth;
import RPCRice.PreProcess;
import RPCRice.Yield;

/**
 * @author zhongweng
 * thairice:default -h 10.2.29.64 -p 8888
 */

public class ThariceClient {
	// public final static String serverAddr = "thairice:default -h 10.2.29.74 -p 8888";
	public final static String serverAddr = "thairice:default -h 127.0.0.1 -p 8888";

	private static Ice.Communicator ic;
	private static Ice.ObjectPrx base;

	private static Map<String, String> mapArgs;
	static {
		// initialize the Ice run time
		ic = Ice.Util.initialize();
		// obtain a proxy for the remote printer
		base = ic.stringToProxy(serverAddr);
		mapArgs = new HashMap<String, String>() {
			{
				put("argKey1", "value1");
				put("argKey2", "value2");
			}
		};
	}
	
	private static RPCRice.InfRicePrx genNewProxy(){
		return RPCRice.InfRicePrxHelper.checkedCast(base);
	}

	public static void main(String[] args) {
		int status = 0;
		try {
			
			CountDownLatch countDownLatch = new CountDownLatch(5);
			System.out.println("---client---start");
			// ===============预处理
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//preProcessing();
					countDownLatch.countDown();
				}
			}).start();
			//=============== 面积监测
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//classifyArea();
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
		argPreProcess.outFilePath = "D:\\Preprocess\\result\\";
		argPreProcess.outFileName = "D:\\Preprocess\\result";

		String resPreProcess = genNewProxy().PreProcessing(argPreProcess, mapArgs);
		System.out.println("RPC Res PreProcessing:" + resPreProcess);

	}

	public static void landDrought() {
		// ==============干旱监测
		Drought argDrought = new Drought();
		argDrought.id = 3;
		argDrought.fileDate = "2017-07-28";
		argDrought.imageLst = "D:\\Thailand_test\\data\\Thailand_LST_2017209.tif";
		argDrought.imageNdvi = "D:\\Thailand_test\\data\\Thailand_NDVI_2017209.tif";
		argDrought.imageLanduse = "D:\\Thailand_test\\landuse\\1km";
		argDrought.shpfilelPath = "D:\\\\Thailand_test\\\\shp";
		argDrought.outPath = "E:\\\\thairiceproduct\\\\Drought";
		argDrought.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
		argDrought.threshold1 = 0.2f;
		argDrought.threshold2 = 0.4f;
		argDrought.threshold3 = 0.6f;
		argDrought.threshold4 = 0.8f;
		System.out.println("RPC  干旱监测 开始：");
		String landdrought = genNewProxy().landdrought(argDrought, mapArgs);
		System.out.println("RPC  干旱监测 完成：返回结果:" + landdrought);

	}

	public static void grouthMonitor() {
		// ==============长势监测
		Growth argGrowth = new Growth();
		argGrowth.id = 1;
		argGrowth.fileDate = "2017-08-13";
		argGrowth.pathNdvi = "D:\\Thailand_test\\data\\MOD13Q120170813.tif";
		argGrowth.imageLanduse = "D:\\Thailand_test\\landuse";
		argGrowth.shpfilePath = "D:\\\\Thailand_test\\\\shp";
		argGrowth.outPath = "E:\\\\thairiceproduct\\\\Growth";
		argGrowth.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
		argGrowth.threshold1 = -0.3f;
		argGrowth.threshold2 = -0.1f;
		argGrowth.threshold3 = 0.1f;
		argGrowth.threshold4 = 0.3f;

		Map<String, String> mapArgs = new HashMap<>();
		mapArgs.put("1", "D:\\Thailand_test\\data\\MOD13Q120110813.tif");
		mapArgs.put("2", "D:\\Thailand_test\\data\\MOD13Q120120813.tif");
		mapArgs.put("3", "D:\\Thailand_test\\data\\MOD13Q120130813.tif");
		mapArgs.put("4", "D:\\Thailand_test\\data\\MOD13Q120140813.tif");
		mapArgs.put("5", "D:\\Thailand_test\\data\\MOD13Q120150813.tif");
		
		System.out.println("RPC  长势监测 开始：");
		String resGrowth = genNewProxy().ricegrowth(argGrowth, mapArgs);
		System.out.println("RPC  长势监测 完成, 返回结果：:" + resGrowth);
	}

	static List<String> listYieldArgs = Arrays.asList(
			"D:\\Thailand_test\\data\\MOD13Q120000813.tif"
			,"D:\\Thailand_test\\data\\MOD13Q120010813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120020813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120030813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120040813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120050813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120060813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120070813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120080813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120090813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120100813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120110813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120120813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120130813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120140813.tif" 
			,"D:\\Thailand_test\\data\\MOD13Q120150813.tif" 
			);
	public static void landYield() {
		// ==============水稻估产
		Yield argYield = new Yield();
		argYield.id = 2;
		argYield.fileDate = "2017-08-13";
		argYield.pathNdvi = "D:\\Thailand_test\\data\\MOD13Q120170813.tif";
		argYield.outCode = "72";
		argYield.pathStatistics = "D:\\Thailand_test\\statistic\\72.csv ";
		argYield.imageLanduse = "D:\\Thailand_test\\landuse";
		argYield.outPath = "E:\\\\thairiceproduct\\\\Yield";
		argYield.shpfilePath = "D:\\\\Thailand_test\\\\shp";
		argYield.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
		Map<String, String> mapArgs = new HashMap<>();

		for (int j = 0; j < listYieldArgs.size(); j++) {
			mapArgs.put(String.valueOf(j), listYieldArgs.get(j));
		}
		
		System.out.println("RPC  估产 开始：");
		 String landyield = genNewProxy().landyield(argYield, mapArgs);
		System.out.println("RPC  估产 完成, 返回结果：:" + landyield);
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
	
		String maxlikehood = genNewProxy().maxlikehood(argClassifyA, mapArgs);
		System.out.println("RPC Res maxlikehood:" + maxlikehood);

		ClassifyB argClassifyB = new ClassifyB();
		argClassifyB.id = 1;
		argClassifyB.fileDate = "";
		argClassifyB.outCode = "72";
		argClassifyB.modClassShp = "D:\\Thailand_test\\preshp";
		String split = genNewProxy().split(argClassifyB, mapArgs);
		System.out.println("RPC Res split:" + split);
	}
	public static String Area_classifyA(ClassifyA argClassifyA,Map<String, String> mapArgs)
	{
		try {
			String argClassifyA_result = genNewProxy().maxlikehood(argClassifyA, mapArgs);
			
			System.out.println("RPC Area_classifyA:" + argClassifyA_result);
			return argClassifyA_result;
		}catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}
		
	}
	public static String Area_classifyB(ClassifyB argClassifyB,Map<String, String> mapArgs)
	{
		try {
			String argClassifyB_result = genNewProxy().split(argClassifyB, mapArgs);
			System.out.println("RPC Area_classifyB:" + argClassifyB_result);
			return argClassifyB_result;
		}catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}
		
	}

}
