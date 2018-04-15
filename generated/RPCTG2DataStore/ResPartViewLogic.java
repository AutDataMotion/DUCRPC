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

public class ResPartViewLogic implements java.lang.Cloneable, java.io.Serializable
{
    public int status;

    public MdlPartView[] mdlPViews;

    public ResPartViewLogic()
    {
    }

    public ResPartViewLogic(int status, MdlPartView[] mdlPViews)
    {
        this.status = status;
        this.mdlPViews = mdlPViews;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ResPartViewLogic _r = null;
        if(rhs instanceof ResPartViewLogic)
        {
            _r = (ResPartViewLogic)rhs;
        }

        if(_r != null)
        {
            if(status != _r.status)
            {
                return false;
            }
            if(!java.util.Arrays.equals(mdlPViews, _r.mdlPViews))
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCTG2DataStore::ResPartViewLogic");
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        __h = IceInternal.HashUtil.hashAdd(__h, mdlPViews);
        return __h;
    }

    public ResPartViewLogic
    clone()
    {
        ResPartViewLogic c = null;
        try
        {
            c = (ResPartViewLogic)super.clone();
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
        __os.writeInt(status);
        ListMdlPartViewsHelper.write(__os, mdlPViews);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        status = __is.readInt();
        mdlPViews = ListMdlPartViewsHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, ResPartViewLogic __v)
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

    static public ResPartViewLogic
    __read(IceInternal.BasicStream __is, ResPartViewLogic __v)
    {
        if(__v == null)
        {
             __v = new ResPartViewLogic();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ResPartViewLogic __nullMarshalValue = new ResPartViewLogic();

    public static final long serialVersionUID = 5196470044912847755L;
}
