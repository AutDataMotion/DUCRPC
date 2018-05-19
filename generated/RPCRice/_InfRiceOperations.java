// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `rice.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCRice;

public interface _InfRiceOperations
{
    String PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    String maxlikehood(Classify inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    String GrowthMonitor(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    String landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    String landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);
}
