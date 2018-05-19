/*
RPC调用接口
*/

module RPCRice {
	struct PreProcess{
  		int id; 			//任务编号
		string h26v06;	//MODIS数据条带1
   		string h27v06;	//MODIS数据条带2
  		 string h27v07;	//MODIS数据条带3
   		string h27v08;	//MODIS数据条带4
   		string h28v07;	//MODIS数据条带5
   		string h28v08;	//MODIS数据条带6
   		string shpfile;	//泰国全国矢量边界shp文件
   		string outFile;	//预处理结果存放路径
   };
   
   struct Classify{
   		int		id;						// 任务编号
   		string imagePath;       //Landsat预处理后图像路径
   		string outPathTif;     //分类结果图像存放文件夹
   		string outPathShp;     //水稻提取结果存放文件夹
   		string lablePath;       //样本shp存放文件夹
   		string roiPath;         //样本ROI文件存放文件夹
   		string pathGdalwarpS;  //gdal裁剪模块文件路径
   		string outCode;         //行政区代码code
   		string shpfile1;         //行政区范围shp
   		string shpfile2;         //市级行政区划shp
   		string shpfile3;         //县级行政区划shp
   };
   
   struct Drought{
   		int		id;						// 任务编号
   		string imageLst;        // 温度文件路径
   		string imageNdvi;       // NDVI文件路径
   		string imageLanduse;    // 泰国农田栅格数据（1km）
   		string outPathClip;    // 裁剪后文件存放文件夹
   		string outPathMusk;    // 掩膜处理后文件存放文件夹
   		string outPathTif;     //TVDI结果tif文件存放文件夹
   		string outPathShp;     //干旱分解结果存放路径
   		string pathGdalwarpS;  //gdal裁剪模块文件路径
   		string shpfile1;         //泰国全国矢量边界shp文件
   		string shpfile2;         //泰国省级行政区划shp文件
   		float threshold1;        //阈值参数1：默认为0.2
   		float threshold2;        //阈值参数1：默认为0.4
   		float threshold3;        //阈值参数1：默认为0.6
   		float threshold4;        //阈值参数1：默认为0.8
   };
   struct Growth{
   		int	id;					//任务编号
		string imgPath;			//输入文件路径，MOD13Q1：250米植被指数产品
		int	begYr;				//历史数据起始年份（需要确保系统中有从起始年份到结束年份的MOD13Q1数据）
		int	endYr;				//历史数据结束年份
		float trVal1;	//阈值参数1
		float trVal2;	//阈值参数2
		float trVal3;	//阈值参数3
		float trVal4;	//阈值参数4
		string outFile;			//输出结果路径
};
    struct Yield{
    	int		id;						// 任务编号
		string	pathNdvi;			//NDVI存储路径txt
		string imageLanduse;    //行政区农田栅格数据（250m）
		string pathStatistics;  //行政区农作物产量统计数据
		string outPathClip;    //裁剪后NDVI存放路径
		string outPathMusk;    //掩膜处理后NDVI存放路径
		string pathGdalwarpS;  //gdal裁剪模块文件路径
		string outCode;         //行政区对应编码
		string outPathTif;     //估产tif图像存放路径
		string outPathShp;     //估产结果shp结果存放路径
		string shpfile1;         //行政区划矢量边界shp文件存放路径
		string shpfile2;         //市级行政区划shp
		string shpfile3;         //县级行政区划shp
	};
	
    dictionary<string, string> DirArgs;
    
    interface InfRice {
   		 // 预处理
		string PreProcessing(PreProcess inputfile, DirArgs mapArgs);
    
    	// 面积监测
    	string maxlikehood (Classify inputclass, DirArgs mapArgs);
    	
    	// 长势监测
		string GrowthMonitor(Growth inputGrowth, DirArgs mapArgs);
    	
    	// 水稻估产
 		string landyield(Yield inputyield, DirArgs mapArgs);
    	
    	// 干旱监测
    	string landdrought(Drought inputdrought, DirArgs mapArgs);
    	
    };
};
