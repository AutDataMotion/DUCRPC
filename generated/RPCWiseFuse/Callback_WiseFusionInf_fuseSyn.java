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
// Generated from file `wisefuseRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCWiseFuse;

public abstract class Callback_WiseFusionInf_fuseSyn
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<RPCWiseFuse.FusionInf>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        WiseFusionInfPrxHelper.__fuseSyn_completed(this, __result);
    }
}
