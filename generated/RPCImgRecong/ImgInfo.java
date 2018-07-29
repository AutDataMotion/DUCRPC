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

public class ImgInfo implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String path;

    public String name;

    public ImgInfo()
    {
        path = "";
        name = "";
    }

    public ImgInfo(int id, String path, String name)
    {
        this.id = id;
        this.path = path;
        this.name = name;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ImgInfo _r = null;
        if(rhs instanceof ImgInfo)
        {
            _r = (ImgInfo)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(path != _r.path)
            {
                if(path == null || _r.path == null || !path.equals(_r.path))
                {
                    return false;
                }
            }
            if(name != _r.name)
            {
                if(name == null || _r.name == null || !name.equals(_r.name))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCImgRecong::ImgInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, path);
        __h = IceInternal.HashUtil.hashAdd(__h, name);
        return __h;
    }

    public ImgInfo
    clone()
    {
        ImgInfo c = null;
        try
        {
            c = (ImgInfo)super.clone();
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
        __os.writeInt(id);
        __os.writeString(path);
        __os.writeString(name);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        path = __is.readString();
        name = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, ImgInfo __v)
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

    static public ImgInfo
    __read(IceInternal.BasicStream __is, ImgInfo __v)
    {
        if(__v == null)
        {
             __v = new ImgInfo();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ImgInfo __nullMarshalValue = new ImgInfo();

    public static final long serialVersionUID = -1032568234L;
}
