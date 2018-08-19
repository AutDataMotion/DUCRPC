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

public class PreProcess implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String type;

    public String h26v06;

    public String h27v06;

    public String h27v07;

    public String h27v08;

    public String h28v07;

    public String h28v08;

    public String shpfile;

    public String outFile;

    public PreProcess()
    {
        type = "";
        h26v06 = "";
        h27v06 = "";
        h27v07 = "";
        h27v08 = "";
        h28v07 = "";
        h28v08 = "";
        shpfile = "";
        outFile = "";
    }

    public PreProcess(int id, String type, String h26v06, String h27v06, String h27v07, String h27v08, String h28v07, String h28v08, String shpfile, String outFile)
    {
        this.id = id;
        this.type = type;
        this.h26v06 = h26v06;
        this.h27v06 = h27v06;
        this.h27v07 = h27v07;
        this.h27v08 = h27v08;
        this.h28v07 = h28v07;
        this.h28v08 = h28v08;
        this.shpfile = shpfile;
        this.outFile = outFile;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        PreProcess _r = null;
        if(rhs instanceof PreProcess)
        {
            _r = (PreProcess)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(type != _r.type)
            {
                if(type == null || _r.type == null || !type.equals(_r.type))
                {
                    return false;
                }
            }
            if(h26v06 != _r.h26v06)
            {
                if(h26v06 == null || _r.h26v06 == null || !h26v06.equals(_r.h26v06))
                {
                    return false;
                }
            }
            if(h27v06 != _r.h27v06)
            {
                if(h27v06 == null || _r.h27v06 == null || !h27v06.equals(_r.h27v06))
                {
                    return false;
                }
            }
            if(h27v07 != _r.h27v07)
            {
                if(h27v07 == null || _r.h27v07 == null || !h27v07.equals(_r.h27v07))
                {
                    return false;
                }
            }
            if(h27v08 != _r.h27v08)
            {
                if(h27v08 == null || _r.h27v08 == null || !h27v08.equals(_r.h27v08))
                {
                    return false;
                }
            }
            if(h28v07 != _r.h28v07)
            {
                if(h28v07 == null || _r.h28v07 == null || !h28v07.equals(_r.h28v07))
                {
                    return false;
                }
            }
            if(h28v08 != _r.h28v08)
            {
                if(h28v08 == null || _r.h28v08 == null || !h28v08.equals(_r.h28v08))
                {
                    return false;
                }
            }
            if(shpfile != _r.shpfile)
            {
                if(shpfile == null || _r.shpfile == null || !shpfile.equals(_r.shpfile))
                {
                    return false;
                }
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCRice::PreProcess");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, type);
        __h = IceInternal.HashUtil.hashAdd(__h, h26v06);
        __h = IceInternal.HashUtil.hashAdd(__h, h27v06);
        __h = IceInternal.HashUtil.hashAdd(__h, h27v07);
        __h = IceInternal.HashUtil.hashAdd(__h, h27v08);
        __h = IceInternal.HashUtil.hashAdd(__h, h28v07);
        __h = IceInternal.HashUtil.hashAdd(__h, h28v08);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfile);
        __h = IceInternal.HashUtil.hashAdd(__h, outFile);
        return __h;
    }

    public PreProcess
    clone()
    {
        PreProcess c = null;
        try
        {
            c = (PreProcess)super.clone();
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
        __os.writeString(type);
        __os.writeString(h26v06);
        __os.writeString(h27v06);
        __os.writeString(h27v07);
        __os.writeString(h27v08);
        __os.writeString(h28v07);
        __os.writeString(h28v08);
        __os.writeString(shpfile);
        __os.writeString(outFile);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        type = __is.readString();
        h26v06 = __is.readString();
        h27v06 = __is.readString();
        h27v07 = __is.readString();
        h27v08 = __is.readString();
        h28v07 = __is.readString();
        h28v08 = __is.readString();
        shpfile = __is.readString();
        outFile = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, PreProcess __v)
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

    static public PreProcess
    __read(IceInternal.BasicStream __is, PreProcess __v)
    {
        if(__v == null)
        {
             __v = new PreProcess();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final PreProcess __nullMarshalValue = new PreProcess();

    public static final long serialVersionUID = 4168726922658344042L;
}
