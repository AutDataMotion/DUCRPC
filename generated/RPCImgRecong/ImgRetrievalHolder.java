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
// Generated from file `ImageRetrieveRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCImgRecong;

public final class ImgRetrievalHolder extends Ice.ObjectHolderBase<ImgRetrieval>
{
    public
    ImgRetrievalHolder()
    {
    }

    public
    ImgRetrievalHolder(ImgRetrieval value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof ImgRetrieval)
        {
            value = (ImgRetrieval)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _ImgRetrievalDisp.ice_staticId();
    }
}
