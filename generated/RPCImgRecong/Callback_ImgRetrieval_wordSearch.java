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
// Generated from file `ImageRetrieveRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCImgRecong;

public abstract class Callback_ImgRetrieval_wordSearch
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<RPCImgRecong.WordRes>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        ImgRetrievalPrxHelper.__wordSearch_completed(this, __result);
    }
}
