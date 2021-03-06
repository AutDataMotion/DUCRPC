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

public class Growth implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String fileDate;

    public String pathNdvi;

    public String imageLanduse;

    public String shpfilePath;

    public String outPath;

    public String pathGdalwarpS;

    public float threshold1;

    public float threshold2;

    public float threshold3;

    public float threshold4;

    public Growth()
    {
        fileDate = "";
        pathNdvi = "";
        imageLanduse = "";
        shpfilePath = "";
        outPath = "";
        pathGdalwarpS = "";
    }

    public Growth(int id, String fileDate, String pathNdvi, String imageLanduse, String shpfilePath, String outPath, String pathGdalwarpS, float threshold1, float threshold2, float threshold3, float threshold4)
    {
        this.id = id;
        this.fileDate = fileDate;
        this.pathNdvi = pathNdvi;
        this.imageLanduse = imageLanduse;
        this.shpfilePath = shpfilePath;
        this.outPath = outPath;
        this.pathGdalwarpS = pathGdalwarpS;
        this.threshold1 = threshold1;
        this.threshold2 = threshold2;
        this.threshold3 = threshold3;
        this.threshold4 = threshold4;
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
            if(fileDate != _r.fileDate)
            {
                if(fileDate == null || _r.fileDate == null || !fileDate.equals(_r.fileDate))
                {
                    return false;
                }
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
            if(shpfilePath != _r.shpfilePath)
            {
                if(shpfilePath == null || _r.shpfilePath == null || !shpfilePath.equals(_r.shpfilePath))
                {
                    return false;
                }
            }
            if(outPath != _r.outPath)
            {
                if(outPath == null || _r.outPath == null || !outPath.equals(_r.outPath))
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
            if(threshold1 != _r.threshold1)
            {
                return false;
            }
            if(threshold2 != _r.threshold2)
            {
                return false;
            }
            if(threshold3 != _r.threshold3)
            {
                return false;
            }
            if(threshold4 != _r.threshold4)
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCRice::Growth");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, fileDate);
        __h = IceInternal.HashUtil.hashAdd(__h, pathNdvi);
        __h = IceInternal.HashUtil.hashAdd(__h, imageLanduse);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfilePath);
        __h = IceInternal.HashUtil.hashAdd(__h, outPath);
        __h = IceInternal.HashUtil.hashAdd(__h, pathGdalwarpS);
        __h = IceInternal.HashUtil.hashAdd(__h, threshold1);
        __h = IceInternal.HashUtil.hashAdd(__h, threshold2);
        __h = IceInternal.HashUtil.hashAdd(__h, threshold3);
        __h = IceInternal.HashUtil.hashAdd(__h, threshold4);
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
        __os.writeString(fileDate);
        __os.writeString(pathNdvi);
        __os.writeString(imageLanduse);
        __os.writeString(shpfilePath);
        __os.writeString(outPath);
        __os.writeString(pathGdalwarpS);
        __os.writeFloat(threshold1);
        __os.writeFloat(threshold2);
        __os.writeFloat(threshold3);
        __os.writeFloat(threshold4);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        fileDate = __is.readString();
        pathNdvi = __is.readString();
        imageLanduse = __is.readString();
        shpfilePath = __is.readString();
        outPath = __is.readString();
        pathGdalwarpS = __is.readString();
        threshold1 = __is.readFloat();
        threshold2 = __is.readFloat();
        threshold3 = __is.readFloat();
        threshold4 = __is.readFloat();
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

    public static final long serialVersionUID = -1965669818L;
}
