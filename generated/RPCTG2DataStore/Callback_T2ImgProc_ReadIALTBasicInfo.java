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
// Generated from file `TG2DataStoreRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCTG2DataStore;

/**
 * IALT提取元信息
 **/

public abstract class Callback_T2ImgProc_ReadIALTBasicInfo
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<RPCTG2DataStore.IALTInfo>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        T2ImgProcPrxHelper.__ReadIALTBasicInfo_completed(this, __result);
    }
}
