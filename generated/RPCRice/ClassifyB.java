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

public class ClassifyB implements java.lang.Cloneable, java.io.Serializable
{
    public int id;

    public String fileDate;

    public String outCode;

    public String modClassShp;

    public String shpfilePath;

    public String outPath;

    public ClassifyB()
    {
        fileDate = "";
        outCode = "";
        modClassShp = "";
        shpfilePath = "";
        outPath = "";
    }

    public ClassifyB(int id, String fileDate, String outCode, String modClassShp, String shpfilePath, String outPath)
    {
        this.id = id;
        this.fileDate = fileDate;
        this.outCode = outCode;
        this.modClassShp = modClassShp;
        this.shpfilePath = shpfilePath;
        this.outPath = outPath;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ClassifyB _r = null;
        if(rhs instanceof ClassifyB)
        {
            _r = (ClassifyB)rhs;
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
            if(outCode != _r.outCode)
            {
                if(outCode == null || _r.outCode == null || !outCode.equals(_r.outCode))
                {
                    return false;
                }
            }
            if(modClassShp != _r.modClassShp)
            {
                if(modClassShp == null || _r.modClassShp == null || !modClassShp.equals(_r.modClassShp))
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

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCRice::ClassifyB");
        __h = IceInternal.HashUtil.hashAdd(__h, id);
        __h = IceInternal.HashUtil.hashAdd(__h, fileDate);
        __h = IceInternal.HashUtil.hashAdd(__h, outCode);
        __h = IceInternal.HashUtil.hashAdd(__h, modClassShp);
        __h = IceInternal.HashUtil.hashAdd(__h, shpfilePath);
        __h = IceInternal.HashUtil.hashAdd(__h, outPath);
        return __h;
    }

    public ClassifyB
    clone()
    {
        ClassifyB c = null;
        try
        {
            c = (ClassifyB)super.clone();
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
        __os.writeString(outCode);
        __os.writeString(modClassShp);
        __os.writeString(shpfilePath);
        __os.writeString(outPath);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        id = __is.readInt();
        fileDate = __is.readString();
        outCode = __is.readString();
        modClassShp = __is.readString();
        shpfilePath = __is.readString();
        outPath = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, ClassifyB __v)
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

    static public ClassifyB
    __read(IceInternal.BasicStream __is, ClassifyB __v)
    {
        if(__v == null)
        {
             __v = new ClassifyB();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ClassifyB __nullMarshalValue = new ClassifyB();

    public static final long serialVersionUID = 1774265937L;
}
