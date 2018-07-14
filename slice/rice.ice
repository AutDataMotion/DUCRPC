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
   		string fileDate;        //文件的collect time  20140102
   		string imagePath;       // 读库 Landsat预处理后图像路径 D:\\classify\\data\\oli_20140102_22_Clip1.tif
   		string outCode;         // imagePath的文件名读取 行政区代码code 72
   		string shpfilePath; // 写死 行政区范围shp D:\\classify\\shp\\Thailand_SuphanburiProvince.shp
   		string lablePath;       // 云飞 读库  t9sample_info 样本shp存放文件夹 D:\\classify\\lable2
   		string outprePath;   // 写死 分类结果图像存放文件夹    D:\\Thailand_test\\preshp
   		string pathGdalwarpS;   // 写死 gdal裁剪模块文件路径 C:\\warmerda\\bld\\bin\\gdalwarp.exe
   };

    struct ClassifyB{
  		int id;	// 任务编号
  		string fileDate;        // 文件的collect time 20140102
		string outCode;         // 读库 云飞写入 在产品表 行政区代码code
   		string modClassShp;     // 读库 云飞写入 在产品表 修正后省级水稻面积   D:\\Thailand_test\\preshp 
   		string shpfilePath;      // 写死 泰国矢量文件路径     D:\\Thailand_test\\PCT_shp
		string outPath;       // 写死 最终结果保存文件夹     D:\\Thailand_test\\classify
   };

   
   struct Drought{
   		int id;	// 任务编号
   		string fileDate;        // 文件的collect time 20170728
   		string imageLst;        // 读库 预处理后的 在产品表 温度文件路径+名称 type 03 LST         D:\\Thailand_test\\data\\Thailand_LST_2017209.tif 
   		string imageNdvi;       //  读库 预处理后的 在产品表  NDVI文件路径+名称  type 01 NDVI_1        D:\\Thailand_test\\data\\Thailand_NDVI_2017209.tif 
   		string imageLanduse;    //  写死 泰国农田栅格文件夹   D:\\Thailand_test\\landuse\\1km 
   		string shpfilelPath;      // 写死 泰国矢量文件路径      D:\\Thailand_test\\shp 
   		string outPath;      // 写死 干旱最终结果存放文件夹D:\\Thailand_test\\drought 
   		string pathGdalwarpS;   //  写死 gdal裁剪模块文件路径  C:\\warmerda\\bld\\bin\\gdalwarp.exe 
   		float threshold1;       // 读库 参数表 阈值参数1：默认为0.2  参数表 
   		float threshold2;       //读库 参数表 阈值参数1：默认为0.4
   		float threshold3;       // 读库 参数表 阈值参数1：默认为0.6
   		float threshold4;       // 读库 参数表 阈值参数1：默认为0.8
   };

      struct Growth{
   		int	id;	//任务编号
   		string fileDate; // 从文件名 collectTime
   		string pathNdvi; // 读库 预处理完的 tif type 02 NDVI_02 路径+文件名
		string imageLanduse;	// 写死 D:\\Thailand_test\\landuse
		string shpfilePath;     // 写死 D:\\Thailand_test\\shp
		string outPath;         // 写死 D:\\Thailand_test\\grouth
		string pathGdalwarpS;   // 写死 C:\\warmerda\\bld\\bin\\gdalwarp.exe
  		float threshold1;       // 读库 长势 阈值参数1：默认为-0.3  参数表 
   		float threshold2;       // 读库 长势 阈值参数2：默认为-0.1
   		float threshold3;       // 读库 长势 阈值参数3：默认为0.1
   		float threshold4;       // 读库 长势 阈值参数4：默认为0.3
	};

      struct Yield{
    	int id;	 // 任务编号
    	string fileDate;       // 文件的 collect time  20170723
    	string pathNdvi;	   // 读库 路径+名称 type 02 NDVI_02 t12_pre_process_inf 的filePath fileName  NDVI存储路径txt            D:\\Thailand_test\\data\\Clip_N2_2017.tif
		string outCode;        // imagePath的文件名读取 行政区对应编码  72 
		string pathStatistics; // 写死 行政区农作物产量统计数据   D:\\Thailand_test\\statistic\\Suphanburd.csv 
		string imageLanduse;   // 写死 行政区农田（250m）文件夹   D:\\Thailand_test\\landuse\\250m 
		string outPath;    // 写死 裁剪后NDVI存放文件夹           D:\\Thailand_test\\yield 
		string shpfilePath;        // 写死 行政区划矢量边界shp文件夹  D:\\Thailand_test\\shp\\Province 
		string pathGdalwarpS;  // 写死 gdal裁剪模块文件路径       C:\\warmerda\\bld\\bin\\gdalwarp.exe
	};

    dictionary<string, string> DirArgs;
    interface InfRice {

   		 // 预处理
		string PreProcessing(PreProcess inputfile, DirArgs mapArgs);
 
    	// 面积监测初步结果
    	string maxlikehood (ClassifyA inputclass, DirArgs mapArgs);

		// 修正后面积监测按行政区分解
        string split(ClassifyB inputclass, DirArgs mapArgs); 

    	// 长势监测preProcessing
    	// 更具参数表 长势 开始年 到 结束年 预处理后的表中读fileDate该日的 type 02 的所有文件(每一年会有一个)路径+文件名
		string GrowthMonitor(Growth inputGrowth, DirArgs mapArgs);
 
    	// 水稻估产 string pathNdvi;	   多个NDVI存储路径放在mapArgs <key, value> key:"p1" value:""
    	// 全国每个code进行遍历调用
		string landyield(Yield inputyield, DirArgs mapArgs);
 
    	// 干旱监测
    	string landdrought(Drought inputdrought, DirArgs mapArgs);
    };
};
