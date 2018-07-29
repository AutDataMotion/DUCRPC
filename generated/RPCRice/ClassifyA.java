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

public class ClassifyA implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String imagePath;

    public String outPathTif;

    public String outPathShp;

    public String lablePath;

    public String roiPath;

    public String pathGdalwarpS;

    public String outCode;

    public String shpfileProvince;

    public ClassifyA()
    {
        imagePath = "";
        outPathTif = "";
        outPathShp = "";
        lablePath = "";
        roiPath = "";
        pathGdalwarpS = "";
        outCode = "";
        shpfileProvince = "";
    }

    public ClassifyA(int id, String imagePath, String outPathTif, String outPathShp, String lablePath, String roiPath, String pathGdalwarpS, String outCode, String shpfileProvince)
    {
        this.id = id;
        this.imagePath = imagePath;
        this.outPathTif = outPathTif;
        this.outPathShp = outPathShp;
        this.lablePath = lablePath;
        this.roiPath = roiPath;
        this.pathGdalwarpS = pathGdalwarpS;
        this.outCode = outCode;
        this.shpfileProvince = shpfileProvince;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ClassifyA _r = null;
        if(rhs instanceof ClassifyA)
        {
            _r = (ClassifyA)rhs;
        }

        if(_r != null)
        {
            if(id != _r.id)
            {
                return false;
            }
            if(imagePath != _r.imagePath)
            {
                if(imagePath == null || _r.imagePath == null || !imagePath.equals(_r.imagePath))
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
            if(lablePath != _r.lablePath)
            {
                if(lablePath == null || _r.lablePath == null || !lablePath.equals(_r.lablePath))
                {
                    return false;
                }
            }
            if(roiPath != _r.roiPath)
            {
                if(roiPath == null || _r.roiPath == null || !roiPath.equals(_r.roiPath))
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
            if(shpfileProvince != _r.shpfileProvince)
            {
                if(shpfileProvince == null || _r.shpfileProvince == null || !shpfileProvince.equals(_r.shpfileProvince))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCRice::ClassifyA");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, imagePath);
        __h = IceInternal.HashUtil.hashAdd(__h, outPathTif);
        __h = IceInternal.HashUtil.hashAdd(__h, outPathShp);
        __h = IceInternal.HashUtil.hashAdd(__h, lablePath);
        __h = IceInternal.HashUtil.hashAdd(__h, roiPath);
        __h = IceInternal.HashUtil.hashAdd(__h, pathGdalwarpS);
        __h = IceInternal.HashUtil.hashAdd(__h, outCode);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfileProvince);
        return __h;
    }

    public ClassifyA
    clone()
    {
        ClassifyA c = null;
        try
        {
            c = (ClassifyA)super.clone();
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
        __os.writeString(imagePath);
        __os.writeString(outPathTif);
        __os.writeString(outPathShp);
        __os.writeString(lablePath);
        __os.writeString(roiPath);
        __os.writeString(pathGdalwarpS);
        __os.writeString(outCode);
        __os.writeString(shpfileProvince);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        imagePath = __is.readString();
        outPathTif = __is.readString();
        outPathShp = __is.readString();
        lablePath = __is.readString();
        roiPath = __is.readString();
        pathGdalwarpS = __is.readString();
        outCode = __is.readString();
        shpfileProvince = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, ClassifyA __v)
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

    static public ClassifyA
    __read(IceInternal.BasicStream __is, ClassifyA __v)
    {
        if(__v == null)
        {
             __v = new ClassifyA();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ClassifyA __nullMarshalValue = new ClassifyA();

    public static final long serialVersionUID = -908271716L;
}
