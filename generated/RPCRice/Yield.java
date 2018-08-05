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
// Generated from file `rice.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCRice;

public class Yield implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String pathNdvi;

    public String imageLanduse;

    public String pathStatistics;

    public String outPathClip;

    public String outPathMusk;

    public String pathGdalwarpS;

    public String outCode;

    public String outPathTif;

    public String outPathShp;

    public String shpfile1;

    public String shpfile2;

    public String shpfile3;

    public Yield()
    {
        pathNdvi = "";
        imageLanduse = "";
        pathStatistics = "";
        outPathClip = "";
        outPathMusk = "";
        pathGdalwarpS = "";
        outCode = "";
        outPathTif = "";
        outPathShp = "";
        shpfile1 = "";
        shpfile2 = "";
        shpfile3 = "";
    }

    public Yield(int id, String pathNdvi, String imageLanduse, String pathStatistics, String outPathClip, String outPathMusk, String pathGdalwarpS, String outCode, String outPathTif, String outPathShp, String shpfile1, String shpfile2, String shpfile3)
    {
        this.id = id;
        this.pathNdvi = pathNdvi;
        this.imageLanduse = imageLanduse;
        this.pathStatistics = pathStatistics;
        this.outPathClip = outPathClip;
        this.outPathMusk = outPathMusk;
        this.pathGdalwarpS = pathGdalwarpS;
        this.outCode = outCode;
        this.outPathTif = outPathTif;
        this.outPathShp = outPathShp;
        this.shpfile1 = shpfile1;
        this.shpfile2 = shpfile2;
        this.shpfile3 = shpfile3;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        Yield _r = null;
        if(rhs instanceof Yield)
        {
            _r = (Yield)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(pathNdvi != _r.pathNdvi)
            {
                if(pathNdvi == null || _r.pathNdvi == null || !pathNdvi.equals(_r.pathNdvi))
                {
                    return false;
                }
            }
            if(imageLanduse != _r.imageLanduse)
            {
                if(imageLanduse == null || _r.imageLanduse == null || !imageLanduse.equals(_r.imageLanduse))
                {
                    return false;
                }
            }
            if(pathStatistics != _r.pathStatistics)
            {
                if(pathStatistics == null || _r.pathStatistics == null || !pathStatistics.equals(_r.pathStatistics))
                {
                    return false;
                }
            }
            if(outPathClip != _r.outPathClip)
            {
                if(outPathClip == null || _r.outPathClip == null || !outPathClip.equals(_r.outPathClip))
                {
                    return false;
                }
            }
            if(outPathMusk != _r.outPathMusk)
            {
                if(outPathMusk == null || _r.outPathMusk == null || !outPathMusk.equals(_r.outPathMusk))
                {
                    return false;
                }
            }
            if(pathGdalwarpS != _r.pathGdalwarpS)
            {
                if(pathGdalwarpS == null || _r.pathGdalwarpS == null || !pathGdalwarpS.equals(_r.pathGdalwarpS))
                {
                    return false;
                }
            }
            if(outCode != _r.outCode)
            {
                if(outCode == null || _r.outCode == null || !outCode.equals(_r.outCode))
                {
                    return false;
                }
            }
            if(outPathTif != _r.outPathTif)
            {
                if(outPathTif == null || _r.outPathTif == null || !outPathTif.equals(_r.outPathTif))
                {
                    return false;
                }
            }
            if(outPathShp != _r.outPathShp)
            {
                if(outPathShp == null || _r.outPathShp == null || !outPathShp.equals(_r.outPathShp))
                {
                    return false;
                }
            }
            if(shpfile1 != _r.shpfile1)
            {
                if(shpfile1 == null || _r.shpfile1 == null || !shpfile1.equals(_r.shpfile1))
                {
                    return false;
                }
            }
            if(shpfile2 != _r.shpfile2)
            {
                if(shpfile2 == null || _r.shpfile2 == null || !shpfile2.equals(_r.shpfile2))
                {
                    return false;
                }
            }
            if(shpfile3 != _r.shpfile3)
            {
                if(shpfile3 == null || _r.shpfile3 == null || !shpfile3.equals(_r.shpfile3))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCRice::Yield");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, pathNdvi);
        __h = IceInternal.HashUtil.hashAdd(__h, imageLanduse);
        __h = IceInternal.HashUtil.hashAdd(__h, pathStatistics);
        __h = IceInternal.HashUtil.hashAdd(__h, outPathClip);
        __h = IceInternal.HashUtil.hashAdd(__h, outPathMusk);
        __h = IceInternal.HashUtil.hashAdd(__h, pathGdalwarpS);
        __h = IceInternal.HashUtil.hashAdd(__h, outCode);
        __h = IceInternal.HashUtil.hashAdd(__h, outPathTif);
        __h = IceInternal.HashUtil.hashAdd(__h, outPathShp);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfile1);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfile2);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfile3);
        return __h;
    }

    public Yield
    clone()
    {
        Yield c = null;
        try
        {
            c = (Yield)super.clone();
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
        __os.writeString(pathNdvi);
        __os.writeString(imageLanduse);
        __os.writeString(pathStatistics);
        __os.writeString(outPathClip);
        __os.writeString(outPathMusk);
        __os.writeString(pathGdalwarpS);
        __os.writeString(outCode);
        __os.writeString(outPathTif);
        __os.writeString(outPathShp);
        __os.writeString(shpfile1);
        __os.writeString(shpfile2);
        __os.writeString(shpfile3);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        pathNdvi = __is.readString();
        imageLanduse = __is.readString();
        pathStatistics = __is.readString();
        outPathClip = __is.readString();
        outPathMusk = __is.readString();
        pathGdalwarpS = __is.readString();
        outCode = __is.readString();
        outPathTif = __is.readString();
        outPathShp = __is.readString();
        shpfile1 = __is.readString();
        shpfile2 = __is.readString();
        shpfile3 = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, Yield __v)
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

    static public Yield
    __read(IceInternal.BasicStream __is, Yield __v)
    {
        if(__v == null)
        {
             __v = new Yield();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final Yield __nullMarshalValue = new Yield();

    public static final long serialVersionUID = 48739471L;
}
