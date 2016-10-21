/*
主要是用来设计海量图像检索的RPC调用接口
*/

module RPCTG2DataStore {
   //------------------IALT----------------------------
   
struct IALTInfo
{
	bool isGenQView;//是否生成了缩略图
	double cntTimeInfo;//读取元信息耗费时间 单位秒
	double cntTimeQView;//缩略图时间  单位秒
	double cntTimeThumb;//拇指图时间  单位秒

	string aircraft;//	飞行器名称	varchar(32)		
	string sensorname;//	传感器名称	varchar(32)		
	string filename0B;//	0B文件名	varchar(512)		
	string segmentID;//	分段号	varchar(32)		
	string dividestyle;//	分景模式	varchar(16)		auto
	string logicalfield;//	分景编号	varchar(32)		
	string Logicalfieldtype;//	分景数据格式	varchar(16)		Gtiff，dat等
	int productlevel;//	数据产品级别	int		0,1,2,3
	string producttype;//	数据产品类型	varchar(8)		raw-功率图像，com-复图像，int-干涉相位，dsm-高程图
	int channel;//	通道标识	varchar(8)		1通道和2通道，0-不属于任何通道
	int band;//	波段	varchar(512)		0,1
	string mode;//	工作模式	varchar(512)		High：高分辨率，Regu：低分辨率
	//string dataaccqtime;//	数据获取时间	datetime	
	//string dateaccqtime;//
	//string datareceivestart;
	//string datacollectstart;
	//string datacollectend;
		
	int bitsperpixel;//	图像位数	int		
	float raspatialresolution;//	距离像素尺寸	float		
	float azspatialresolution;//	方位像素尺寸	float		
	int width;//	图像宽度	int		
	int height;//	图像高度	int		

	int logicalfieldstarty;
	int logicalfieldendly;
	int logicalfieldstartx;
	int logicalfieldendx;
	int logicalfieldwidth;
	int logicalfieldheight;

	// 以下信息在1级和2级产品入库时增加
	double logicalfieldullongitude;//	分景左上经度	double		
	double logicalfieldullatitude;//	分景左上纬度	double		
	double logicalfielddrlongitude;//	分景右上经度	double		
	double logicalfielddrlatitude;//	分景右上纬度	double		
	double logicalfielddllongitude;//	分景左下经度	double		
	double logicalfielddllatitude;//	分景左下纬度	double		
	double logicalfieldlrlongitude;//	分景右下经度	double		
	double logicalfieldlrlatitude;//	分景右下纬度	double		
	string projectiontype;//	投影类型	varchar(128)		
	string datumname;//	投影椭球体	varchar(128)		
	string proj4code;//	投影编码	varchar(512)		
	string projectionunits;//	投影单位	varchar(32)		
	float projcentralmeridian;//	投影带中央经线	float		

	string productname;//	数据产品名称	varchar(128)		
	string datapath;//	数据存储位置	varchar(512)		
	string imagequalityflag;//	图像质量	varchar(512)		
	int status;//	状态	int		0无效 1有效
	string timadd;//	添加时间	datetime		
	string logicalfieldProducttime;//	分景数据生产时间	datetime	

	// 以下信息在1级和2级产品入库时增加
	bool relcalib;//	相对辐射校正	bool
	bool abscalib;//	绝对辐射校正	bool
	bool sysgeocor;//	系统几何校正	bool

	//2级产品入库使用
	string processmodel;//几何处理模型
	
	// 以下信息在缩略图和拇指图生成后增加
	string QuickviewName;//	缩略图文件名称	varchar(128)		
	string Quickviewpath;//	缩略图文件位置	varchar(512) ---存放所缩略图的 width,height	
	int QuickViewResampleRatio;//	缩略图采样率	int		
	string ThumbnailName;//	拇指图文件名称	varchar(128)		
	string Thumbnailpath;//	拇指图文件位置	varchar(512)		
	int Thumbnailsampleration;//	拇指图采样率	int		

	float OverlapRatio;//	相邻重叠区比例	Float		一般为0.1，最后一景和倒数第二景根据实际情况计算
	
	string pol;//极化方式
	float samplerate;//采样率
	float bandwidth;//带宽
};

   //------------------MWI-----------------------------
   struct MdlPartView{
   
		double cntTimePart;//分景耗费时间 单位秒
		double cntTimeCloud;//云判时间  单位秒
		double cntTimeQView;//缩略图时间  单位秒
		double cntTimeThumb;//拇指图时间  单位秒

		string	key;										//唯一key
		string logicalfield;							//分景编号
		string logicalfieldname;					//数据产品名称 原始数据名称后加_1,_2,_3
		int	 logicalfieldstartY;					//分景起始Y(行)-----update7/19
		int	logicalfieldendlY;						//分景结束Y(行)-----update7/19
		int	logicalfieldstartX;					//分景起始X(列)-----update7/19
		int	logicalfieldendX;						//分景结束X(列)-----update7/19
		int	logicalfieldwidth;						//分景图像宽度
		int	logicalfieldheight;					//分景图像高度
		float logicalfieldullongitude;		//分景左上经度
		float logicalfieldullatitude;			//分景左上纬度
		float logicalfielddrlongitude;		//分景右上经度
		float logicalfielddrlatitude;			//分景右上纬度
		float logicalfielddllongitude;		//分景左下经度
		float logicalfielddllatitude;			//分景左下纬度
		float logicalfieldlrlongitude;		//分景右下经度
		float logicalfieldlrlatitude;			//分景右下纬度
		float logicalfieldcloudcoverage;	//分景云覆盖率
		int	logicalfieldfiletype;					//分景文件格式 Gtiff，dat等-----update7/19
		int	logicalfielddatatype;				//分景数据位存储格式----add7/19
		int	logicalfieldbandsnum;				//分景波段数----add7/19
		string	logicalfieldpath;					//分景文件位置----add7/19
		string	quickviewname;					//缩略图文件名称
		string	quickviewpath;						//缩略图文件位置
		string	quickviewbands;					//缩略图选择的波段_分割----add7/19
		int	quickviewfiletype;					//缩略图文件格式----add7/19
		int		quickviewresampleratio;		//缩略图采样率
		string	thumbnailname;					//拇指图文件名称
		string	thumbnailpath;						//拇指图文件位置
		string	thumbnailbands;					//拇指图选择的波段_分割----add7/19
		int	thumbnailfiletype;					//拇指图文件格式----add7/19
		int		thumbnailsampleration;		//拇指图采样率
		float	overlapratio;						//相邻重叠区高度，最后一景和倒数第二景根据实际情况计算-----update7/19
		string	version;								//版本号
   };

   sequence<MdlPartView> ListMdlPartViews;

   struct	ResPartViewLogic{
		int status; //状态信息 -1: 参数错误 0:系统错误  1:成功 
		ListMdlPartViews		mdlPViews;	//分景信息列表
   };

   struct ArgQuickView{
		int	band1;// 云判：NDVI 阈值
		int	band2;// 云判：反射率 阈值
		int	band3;// 云判：反射率比值范围low x 100
		int	scale;		//云判：反射率比值范围high x 100
		int	type;		//输出格式:0:PNG,1:JPEG,2:GTiff
   };

   interface T2ImgProc{

    /**************************************************
   *	初始化功能参数
   ***************************************************/


   /**************************************************
   *	海军.dat封装为tiff方法
   ***************************************************/
   	bool packageTiff0C(string inputFilePath, string inputFileName);
   
   /**************************************************
   *	逻辑分景
   ***************************************************/
   ResPartViewLogic		funPartViewLogic(
		string	path,						//原文件路径
		string	name,						//原文件名称
		int		viewWidth,				//分景后文件Width
		int		viewHeight,				//分景后文件Height
		int		overlapSizeX,			//分景重叠区X大小
		int		overlapSizeY,			//分景重叠区Y大小
		bool		isPartPhysic,				//是否物理分景
		bool		isCloudEstimate,		//是否云判
		ArgQuickView		argCloudEstimate,	//云判参数
		bool		isQuickView,			//是否缩略图
		ArgQuickView		argQuickView,			//缩略图参数
		bool		isThumbnail,				//是否拇指图
		ArgQuickView		argThumbnail			//拇指图参数
   );

    /**************************************************
   *	物理分景
   ***************************************************/
   bool		funPartViewPhysic(
		string	pathSrc,					//原文件路径
		string	nameSrc,					//原文件名称
		int		startX,						//起始X
		int		startY,						//起始Y
		int		sizeX,						//宽度
		int		sizeY,						//高度
		string	pathDes,					//目标文件路径
		string	nameDes					//目标文件名称

   );

   /**************************************************
   *	云判
   *	返回：-1：失败；>=0		云覆盖率(保留2位小数)
   ***************************************************/
   double		funCloudEstimate(
		string	pathSrc,									//分景文件路径
		string	nameSrc,									//分景文件名称
		int		sizeX,										//宽度
		int		sizeY,										//高度
		ArgQuickView		argCloudEstimate	//云判参数
   );
   
   /**************************************************
   *	生成缩略图
   ***************************************************/
   bool		funGenQuickView(
		string	pathSrc,									//分景文件路径
		string	nameSrc,									//分景文件名称
		ArgQuickView		argQuickView,			//缩略图参数10% 为10
		string	pathDes,									//缩略图文件路径
		string	nameDes									//缩略图件名称
   );

    /**************************************************
   *	生成拇指图
   ***************************************************/
   bool		funGenThumbnail(
		string	pathSrc,									//分景文件路径
		string	nameSrc,									//分景文件名称
		ArgQuickView		argThumbnail,			//拇指图参数10% 为10
		string	pathDes,									//拇指图文件路径
		string	nameDes									//拇指图件名称
   );
   

   /**************************************************
   *	IALT提取元信息
   ***************************************************/
   IALTInfo		ReadIALTBasicInfo(
		string szImageFile, 
		string szParamFile1,
		string szParamFile3
   );

    /**************************************************
   *	IALT生成缩略图
   ***************************************************/
   bool		CreateThumbnail(
		string input , 
		int nSamples, 
		 int nLines, 
		string output , 
		string type, 
		int stepSample, 
		int stepLine
	);

   /**************************************************
   *	IALT生成拇指图
   ***************************************************/


   };//end		interface StoreFunInf
   
};//end		module RPCTG2DataStore


