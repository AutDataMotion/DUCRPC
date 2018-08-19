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
// Generated from file `qualityjudgeRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCQualityJudge;

public final class QualityInfHolder extends Ice.ObjectHolderBase<QualityInf>
{
    public
    QualityInfHolder()
    {
    }

    public
    QualityInfHolder(QualityInf value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof QualityInf)
        {
            value = (QualityInf)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _QualityInfDisp.ice_staticId();
    }
}
