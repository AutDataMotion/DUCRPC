// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `TG2DataStoreRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCTG2DataStore;

public interface _T2ImgProcOperationsNC
{
    /**
     * 海军.dat封装为tiff方法
     **/
    boolean packageTiff0C(String inputFilePath, String inputFileName);

    /**
     * 逻辑分景
     **/
    ResPartViewLogic funPartViewLogic(String path, String name, int viewWidth, int viewHeight, int overlapSizeX, int overlapSizeY, boolean isPartPhysic, boolean isCloudEstimate, ArgQuickView argCloudEstimate, boolean isQuickView, ArgQuickView argQuickView, boolean isThumbnail, ArgQuickView argThumbnail);

    /**
     * 物理分景
     **/
    boolean funPartViewPhysic(String pathSrc, String nameSrc, int startX, int startY, int sizeX, int sizeY, String pathDes, String nameDes);

    /**
     * 云判
     * 返回：-1：失败；>=0		云覆盖率(保留2位小数)
     **/
    double funCloudEstimate(String pathSrc, String nameSrc, int sizeX, int sizeY, ArgQuickView argCloudEstimate);

    /**
     * 生成缩略图
     **/
    boolean funGenQuickView(String pathSrc, String nameSrc, ArgQuickView argQuickView, String pathDes, String nameDes);

    /**
     * 生成拇指图
     **/
    boolean funGenThumbnail(String pathSrc, String nameSrc, ArgQuickView argThumbnail, String pathDes, String nameDes);

    /**
     * IALT提取元信息
     **/
    IALTInfo ReadIALTBasicInfo(String szImageFile, String szParamFile1, String szParamFile3);

    /**
     * IALT生成缩略图
     **/
    boolean CreateThumbnail(String input, int nSamples, int nLines, String output, String type, int stepSample, int stepLine);
}
