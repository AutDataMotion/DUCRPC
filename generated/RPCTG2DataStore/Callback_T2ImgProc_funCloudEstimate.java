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

/**
 * 云判
 * 返回：-1：失败；>=0		云覆盖率(保留2位小数)
 **/

public abstract class Callback_T2ImgProc_funCloudEstimate
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackDouble
{
    public final void __completed(Ice.AsyncResult __result)
    {
        T2ImgProcPrxHelper.__funCloudEstimate_completed(this, __result);
    }
}
