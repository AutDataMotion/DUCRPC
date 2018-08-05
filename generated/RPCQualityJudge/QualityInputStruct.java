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
// Generated from file `qualityjudgeRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCQualityJudge;

public class QualityInputStruct implements java.lang.Cloneable, java.io.Serializable
{
    public String id;

    public String algorithmkind;

    public java.util.Map<java.lang.String, ImageParameter> inputMap;

    public QualityInputStruct()
    {
        id = "";
        algorithmkind = "";
    }

    public QualityInputStruct(String id, String algorithmkind, java.util.Map<java.lang.String, ImageParameter> inputMap)
    {
        this.id = id;
        this.algorithmkind = algorithmkind;
        this.inputMap = inputMap;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        QualityInputStruct _r = null;
        if(rhs instanceof QualityInputStruct)
        {
            _r = (QualityInputStruct)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                if(id == null || _r.id == null || !id.equals(_r.id))
                {
                    return false;
                }
            }
            if(algorithmkind != _r.algorithmkind)
            {
                if(algorithmkind == null || _r.algorithmkind == null || !algorithmkind.equals(_r.algorithmkind))
                {
                    return false;
                }
            }
            if(inputMap != _r.inputMap)
            {
                if(inputMap == null || _r.inputMap == null || !inputMap.equals(_r.inputMap))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCQualityJudge::QualityInputStruct");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, algorithmkind);
        __h = IceInternal.HashUtil.hashAdd(__h, inputMap);
        return __h;
    }

    public QualityInputStruct
    clone()
    {
        QualityInputStruct c = null;
        try
        {
            c = (QualityInputStruct)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(id);
        __os.writeString(algorithmkind);
        QualityMapArgsHelper.write(__os, inputMap);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readString();
        algorithmkind = __is.readString();
        inputMap = QualityMapArgsHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, QualityInputStruct __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public QualityInputStruct
    __read(IceInternal.BasicStream __is, QualityInputStruct __v)
    {
        if(__v == null)
        {
             __v = new QualityInputStruct();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final QualityInputStruct __nullMarshalValue = new QualityInputStruct();

    public static final long serialVersionUID = 1545719797L;
}
