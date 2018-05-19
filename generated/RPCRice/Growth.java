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
// Generated from file `rice.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCRice;

public class Growth implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String imgPath;

    public int begYr;

    public int endYr;

    public float trVal1;

    public float trVal2;

    public float trVal3;

    public float trVal4;

    public String outFile;

    public Growth()
    {
        imgPath = "";
        outFile = "";
    }

    public Growth(int id, String imgPath, int begYr, int endYr, float trVal1, float trVal2, float trVal3, float trVal4, String outFile)
    {
        this.id = id;
        this.imgPath = imgPath;
        this.begYr = begYr;
        this.endYr = endYr;
        this.trVal1 = trVal1;
        this.trVal2 = trVal2;
        this.trVal3 = trVal3;
        this.trVal4 = trVal4;
        this.outFile = outFile;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        Growth _r = null;
        if(rhs instanceof Growth)
        {
            _r = (Growth)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(imgPath != _r.imgPath)
            {
                if(imgPath == null || _r.imgPath == null || !imgPath.equals(_r.imgPath))
                {
                    return false;
                }
            }
            if(begYr != _r.begYr)
            {
                return false;
            }
            if(endYr != _r.endYr)
            {
                return false;
            }
            if(trVal1 != _r.trVal1)
            {
                return false;
            }
            if(trVal2 != _r.trVal2)
            {
                return false;
            }
            if(trVal3 != _r.trVal3)
            {
                return false;
            }
            if(trVal4 != _r.trVal4)
            {
                return false;
            }
            if(outFile != _r.outFile)
            {
                if(outFile == null || _r.outFile == null || !outFile.equals(_r.outFile))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCRice::Growth");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, imgPath);
        __h = IceInternal.HashUtil.hashAdd(__h, begYr);
        __h = IceInternal.HashUtil.hashAdd(__h, endYr);
        __h = IceInternal.HashUtil.hashAdd(__h, trVal1);
        __h = IceInternal.HashUtil.hashAdd(__h, trVal2);
        __h = IceInternal.HashUtil.hashAdd(__h, trVal3);
        __h = IceInternal.HashUtil.hashAdd(__h, trVal4);
        __h = IceInternal.HashUtil.hashAdd(__h, outFile);
        return __h;
    }

    public Growth
    clone()
    {
        Growth c = null;
        try
        {
            c = (Growth)super.clone();
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
        __os.writeString(imgPath);
        __os.writeInt(begYr);
        __os.writeInt(endYr);
        __os.writeFloat(trVal1);
        __os.writeFloat(trVal2);
        __os.writeFloat(trVal3);
        __os.writeFloat(trVal4);
        __os.writeString(outFile);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        imgPath = __is.readString();
        begYr = __is.readInt();
        endYr = __is.readInt();
        trVal1 = __is.readFloat();
        trVal2 = __is.readFloat();
        trVal3 = __is.readFloat();
        trVal4 = __is.readFloat();
        outFile = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, Growth __v)
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

    static public Growth
    __read(IceInternal.BasicStream __is, Growth __v)
    {
        if(__v == null)
        {
             __v = new Growth();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final Growth __nullMarshalValue = new Growth();

    public static final long serialVersionUID = -6513187439610366367L;
}