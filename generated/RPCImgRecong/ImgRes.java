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

public class ImgRes implements java.lang.Cloneable, java.io.Serializable
{
    public int status;

    public ImgInfo[] imgRemote;

    public ImgInfo[] imgPic;

    public ImgRes()
    {
    }

    public ImgRes(int status, ImgInfo[] imgRemote, ImgInfo[] imgPic)
    {
        this.status = status;
        this.imgRemote = imgRemote;
        this.imgPic = imgPic;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ImgRes _r = null;
        if(rhs instanceof ImgRes)
        {
            _r = (ImgRes)rhs;
        }

        if(_r != null)
        {
            if(status != _r.status)
            {
                return false;
            }
            if(!java.util.Arrays.equals(imgRemote, _r.imgRemote))
            {
                return false;
            }
            if(!java.util.Arrays.equals(imgPic, _r.imgPic))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCImgRecong::ImgRes");
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        __h = IceInternal.HashUtil.hashAdd(__h, imgRemote);
        __h = IceInternal.HashUtil.hashAdd(__h, imgPic);
        return __h;
    }

    public ImgRes
    clone()
    {
        ImgRes c = null;
        try
        {
            c = (ImgRes)super.clone();
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
        ListStringHelper.write(__os, imgRemote);
        ListStringHelper.write(__os, imgPic);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        status = __is.readInt();
        imgRemote = ListStringHelper.read(__is);
        imgPic = ListStringHelper.read(__is);
    }

    static public void
    __write(IceInternal.BasicStream __os, ImgRes __v)
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

    static public ImgRes
    __read(IceInternal.BasicStream __is, ImgRes __v)
    {
        if(__v == null)
        {
             __v = new ImgRes();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ImgRes __nullMarshalValue = new ImgRes();

    public static final long serialVersionUID = -1507258351L;
}
