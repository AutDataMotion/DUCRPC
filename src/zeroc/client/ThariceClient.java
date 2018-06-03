/**
 * 
 */
package zeroc.client;

import java.util.HashMap;
import java.util.Map;

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

	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try {
			// initialize the Ice run time
			ic = Ice.Util.initialize(args);
			// obtain a proxy for the remote printer
			System.out.println("---client---start");
			Ice.ObjectPrx base = ic.stringToProxy(serverAddr);
			RPCRice.InfRicePrx proxy = RPCRice.InfRicePrxHelper.checkedCast(base);
			if (proxy == null)
				throw new Error("Invalid proxy");

			Map<String, String> mapArgs = new HashMap<String, String>() {
				{
					put("argKey1", "value1");
					put("argKey2", "value2");
				}
			};

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

			// ==============面积监测
			ClassifyA argClassifyA = new ClassifyA();
			argClassifyA.id = 1;
			argClassifyA.imagePath = "D:\\classify\\data\\oli_20140102_22_Clip1.tif";
			argClassifyA.outPathTif = "D:\\classify\\result2";
			argClassifyA.outPathShp = "D:\\\\classify\\\\category";
			argClassifyA.lablePath = "D:\\classify\\lable2";
			argClassifyA.roiPath = "D:\\classify\\roi2";
			argClassifyA.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
			argClassifyA.outCode = "72";
			argClassifyA.shpfileProvince = "D:\\classify\\shp\\Thailand_SuphanburiProvince.shp";

			// String maxlikehood = proxy.maxlikehood(argClassifyA, mapArgs);
			// System.out.println("RPC Res maxlikehood:" + maxlikehood);

			ClassifyB argClassifyB = new ClassifyB();
			argClassifyB.id = 1;
			argClassifyB.modClassShp = "D:\\classify\\category\\dissolve_72.shp";
			argClassifyB.shpfileCounty = "D:\\classify\\shp\\Thailand_SuphanburiProvince_County.shp";
			argClassifyB.shpfileTown = "D:\\classify\\shp\\Thailand_SuphanburiProvince_Town.shp";

			// String split = proxy.split(argClassifyB, mapArgs);
			// System.out.println("RPC Res split:" + split);

			// ==============干旱监测
			Drought argDrought = new Drought();
			argDrought.id = 3;
			argDrought.imageLst = "D:\\drought\\data\\Thailand_LST_2017209.tif";
			argDrought.imageNdvi = "D:\\drought\\data\\Thailand_NDVI_2017209.tif";
			argDrought.imageLanduse = "D:\\drought\\land\\ThailandAgriculturalLand_1km_N_n.tif";
			argDrought.outPathClip = "D:\\drought\\clip";
			argDrought.outPathMusk = "D:\\drought\\musk";
			argDrought.outPathTif = "D:\\drought\\tif";
			argDrought.outPathShp = "D:\\\\drought\\\\result";
			argDrought.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
			argDrought.shpfileNation = "D:\\drought\\shp\\Thailand.shp";
			argDrought.shpfileProvince = "D:\\\\drought\\\\shp\\\\Thailand_Province.shp";
			argDrought.threshold1 = 0.2f;
			argDrought.threshold2 = 0.4f;
			argDrought.threshold3 = 0.6f;
			argDrought.threshold4 = 0.8f;

			// String landdrought = proxy.landdrought(argDrought, mapArgs);
			// System.out.println("RPC Res landdrought:" + landdrought);

			// ==============长势监测
			Growth argGrowth = new Growth();
			argGrowth.id = 1;
			argGrowth.imgPath = "D:\\grouth\\data\\Clip_N2_2017.tif";
			argGrowth.begYr = 2001;
			argGrowth.endYr = 2016;
			argGrowth.trVal1 = -0.3f;
			argGrowth.trVal2 = -0.1f;
			argGrowth.trVal3 = 0.1f;
			argGrowth.trVal4 = 0.3f;
			argGrowth.outFile = "D:\\grouth\\result";

			String resGrowth = proxy.GrowthMonitor(argGrowth, mapArgs);
			System.out.println("RPC Res GrowthMonitor:" + resGrowth);

			// ==============水稻估产
			Yield argYield = new Yield();
			argYield.id = 2;
			argYield.pathNdvi = "D:\\yield\\yield4\\filename.txt";
			argYield.imageLanduse = "D:\\yield\\yield4\\land\\Suphanburd_land_250p_N.tif";
			argYield.pathStatistics = "D:\\yield\\yield4\\statistic\\Suphanburd.csv";
			argYield.outPathClip = "D:\\yield\\yield4\\clip";
			argYield.outPathMusk = "D:\\yield\\yield4\\musk";
			argYield.pathGdalwarpS = "C:\\warmerda\\bld\\bin\\gdalwarp.exe";
			argYield.outCode = "72";
			argYield.outPathTif = "D:\\yield\\yield4\\tif";
			argYield.outPathShp = "D:\\\\yield\\\\yield4\\\\result";
			argYield.shpfileProvince = "D:\\yield\\yield4\\shp\\Thailand_SuphanburiProvince.shp";
			argYield.shpfileCounty = "D:\\\\yield\\yield4\\\\shp\\\\Thailand_SuphanburiProvince_County.shp";
			argYield.shpfileTown = "D:\\\\yield\\\\yield4\\shp\\\\Thailand_SuphanburiProvince_Town.shp";

			// String landyield = proxy.landyield(argYield, mapArgs);
			// System.out.println("RPC Res landyield:" + landyield);

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
}
