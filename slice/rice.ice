/*
RPC调用接口
*/


module RPCRice {
	struct PreProcess{
  		int id; 		//任务编号
		string type;
		string h26v06;	//MODIS数据条带1 D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h26v06.006.2017218051159.hdf
   		string h27v06;	//MODIS数据条带2 D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h27v06.006.2017218050132.hdf
  		string h27v07;	//MODIS数据条带3 D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h27v07.006.2017218045926.hdf
   		string h27v08;	//MODIS数据条带4 D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h27v08.006.2017218045323.hdf
  		string h28v07;	//MODIS数据条带5 D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h28v07.006.2017218050254.hdf
    	string h28v08;	//MODIS数据条带6 D:\\data\\MODIS\\test\\LST\\MOD11A2.A2017209.h28v08.006.2017218050332.hdf
   		string shpfile;	//泰国全国矢量边界shp文件 D:\\drought\\shp\\Thailand.shp
   		string outFile;	//预处理结果存放路径 D:\\Preprocess\\result
     };

    struct ClassifyA{
   		int id;		        // 任务编号
   		string imagePath;       //Landsat预处理后图像路径 D:\\classify\\data\\oli_20140102_22_Clip1.tif
        string outPathTif;      //分类结果图像存放文件夹 D:\\classify\\result2
   		string outPathShp;      //水稻提取结果存放文件夹 D:\\classify\\category
   		string lablePath;       //样本shp存放文件夹 D:\\classify\\lable2
   		string roiPath;         //样本ROI文件存放文件夹 D:\\classify\\roi2
   		string pathGdalwarpS;   //gdal裁剪模块文件路径 C:\\warmerda\\bld\\bin\\gdalwarp.exe
   		string outCode;         //行政区代码code 72
   		string shpfileProvince; //行政区范围shp D:\\classify\\shp\\Thailand_SuphanburiProvince.shp
   };

    struct ClassifyB{
  		int id;		        // 任务编号
   		string modClassShp;     //修正后省级水稻面积 D:\\classify\\category\\dissolve_72.shp
   		string shpfileCounty;   //郡级行政区划文件 D:\\classify\\shp\\Thailand_SuphanburiProvince_County.shp
		string shpfileTown;     //县级行政区划文件 D:\\classify\\shp\\Thailand_SuphanburiProvince_Town.shp
   };

   
   struct Drought{
   		int id;	// 任务编号
   		string imageLst;        // 温度文件路径 D:\\drought\\data\\Thailand_LST_2017209.tif
		string imageNdvi;       // NDVI文件路径 D:\\drought\\data\\Thailand_NDVI_2017209.tif
   		string imageLanduse;    // 泰国农田栅格数据（1km）D:\\drought\\land\\ThailandAgriculturalLand_1km_N_n.tif
   		string outPathClip;     // 裁剪后文件存放文件夹 D:\\drought\\clip
   		string outPathMusk;     // 掩膜处理后文件存放文件夹 D:\\drought\\musk
    	string outPathTif;      //TVDI结果tif文件存放文件夹 D:\\drought\\tif
   		string outPathShp;      //干旱分解结果存放路径 D:\\drought\\result
   		string pathGdalwarpS;   //gdal裁剪模块文件路径 C:\\warmerda\\bld\\bin\\gdalwarp.exe
   		string shpfileNation;   //泰国全国矢量边界shp文件  D:\\drought\\shp\\Thailand.shp
   		string shpfileProvince; //泰国省级行政区划shp文件 D:\\drought\\shp\\Thailand_Province.shp
   		float threshold1;       //阈值参数1：默认为0.2  
   		float threshold2;       //阈值参数1：默认为0.4
   		float threshold3;       //阈值参数1：默认为0.6
   		float threshold4;       //阈值参数1：默认为0.8
   };

      struct Growth{
   		int	id;	//任务编号
		string imgPath;	//输入文件路径，MOD13Q1：250米植被指数产品 D:\\grouth\\data\\Clip_N2_2017.tif
		int	begYr;	//历史数据起始年份 2001 （需要确保系统中有从起始年份到结束年份的MOD13Q1数据）
		int	endYr;	//历史数据结束年份 2016
  		float trVal1;	//阈值参数1 -0.3
		float trVal2;	//阈值参数2 -0.1
 		float trVal3;	//阈值参数3  0.1
		float trVal4;	//阈值参数4  0.3
		string outFile;	//输出结果路径 D:\\grouth\\result
	};

      struct Yield{
    	int id;	 // 任务编号
		string	pathNdvi;		//NDVI存储路径txt D:\\yield\\yield4\\filename.txt
		string imageLanduse;    //行政区农田栅格数据（250m）D:\\yield\\yield4\\land\\Suphanburd_land_250p_N.tif
		string pathStatistics;  //行政区农作物产量统计数据  D:\\yield\\yield4\\statistic\\Suphanburd.csv
		string outPathClip;     //裁剪后NDVI存放路径 D:\\yield\\yield4\\clip
		string outPathMusk;     //掩膜处理后NDVI存放路径 D:\\yield\\yield4\\musk
		string pathGdalwarpS;   //gdal裁剪模块文件路径 C:\\warmerda\\bld\\bin\\gdalwarp.exe
		string outCode;         //行政区对应编码 72
		string outPathTif;      //估产tif图像存放路径 D:\\yield\\yield4\\tif
		string outPathShp;      //估产结果shp结果存放路径 D:\\yield\\yield4\\result
		string shpfileProvince; // 行政区划矢量边界shp D:\\yield\\yield4\\shp\\Thailand_SuphanburiProvince.shp
		string shpfileCounty;   //市级行政区划shp D:\\yield\\yield4\\shp\\Thailand_SuphanburiProvince_County.shp
		string shpfileTown;     //县级行政区划shp D:\\yield\\yield4\\shp\\Thailand_SuphanburiProvince_Town.shp
	};

    dictionary<string, string> DirArgs;
    interface InfRice {

   		 // 预处理
		string PreProcessing(PreProcess inputfile, DirArgs mapArgs);
 
    	// 面积监测初步结果
    	string maxlikehood (ClassifyA inputclass, DirArgs mapArgs);

		// 修正后面积监测按行政区分解
        string split(ClassifyB inputclass, DirArgs mapArgs); 

    	// 长势监测
		string GrowthMonitor(Growth inputGrowth, DirArgs mapArgs);
 
    	// 水稻估产
		string landyield(Yield inputyield, DirArgs mapArgs);
 
    	// 干旱监测
    	string landdrought(Drought inputdrought, DirArgs mapArgs);
    };
};
