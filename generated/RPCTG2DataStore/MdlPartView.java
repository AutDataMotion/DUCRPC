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
// Generated from file `TG2DataStoreRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCTG2DataStore;

public class MdlPartView implements java.lang.Cloneable, java.io.Serializable
{
    public double cntTimePart;

    public double cntTimeCloud;

    public double cntTimeQView;

    public double cntTimeThumb;

    public String key;

    public String logicalfield;

    public String logicalfieldname;

    public int logicalfieldstartY;

    public int logicalfieldendlY;

    public int logicalfieldstartX;

    public int logicalfieldendX;

    public int logicalfieldwidth;

    public int logicalfieldheight;

    public float logicalfieldullongitude;

    public float logicalfieldullatitude;

    public float logicalfielddrlongitude;

    public float logicalfielddrlatitude;

    public float logicalfielddllongitude;

    public float logicalfielddllatitude;

    public float logicalfieldlrlongitude;

    public float logicalfieldlrlatitude;

    public float logicalfieldcloudcoverage;

    public int logicalfieldfiletype;

    public int logicalfielddatatype;

    public int logicalfieldbandsnum;

    public String logicalfieldpath;

    public String quickviewname;

    public String quickviewpath;

    public String quickviewbands;

    public int quickviewfiletype;

    public int quickviewresampleratio;

    public String thumbnailname;

    public String thumbnailpath;

    public String thumbnailbands;

    public int thumbnailfiletype;

    public int thumbnailsampleration;

    public float overlapratio;

    public String version;

    public MdlPartView()
    {
        key = "";
        logicalfield = "";
        logicalfieldname = "";
        logicalfieldpath = "";
        quickviewname = "";
        quickviewpath = "";
        quickviewbands = "";
        thumbnailname = "";
        thumbnailpath = "";
        thumbnailbands = "";
        version = "";
    }

    public MdlPartView(double cntTimePart, double cntTimeCloud, double cntTimeQView, double cntTimeThumb, String key, String logicalfield, String logicalfieldname, int logicalfieldstartY, int logicalfieldendlY, int logicalfieldstartX, int logicalfieldendX, int logicalfieldwidth, int logicalfieldheight, float logicalfieldullongitude, float logicalfieldullatitude, float logicalfielddrlongitude, float logicalfielddrlatitude, float logicalfielddllongitude, float logicalfielddllatitude, float logicalfieldlrlongitude, float logicalfieldlrlatitude, float logicalfieldcloudcoverage, int logicalfieldfiletype, int logicalfielddatatype, int logicalfieldbandsnum, String logicalfieldpath, String quickviewname, String quickviewpath, String quickviewbands, int quickviewfiletype, int quickviewresampleratio, String thumbnailname, String thumbnailpath, String thumbnailbands, int thumbnailfiletype, int thumbnailsampleration, float overlapratio, String version)
    {
        this.cntTimePart = cntTimePart;
        this.cntTimeCloud = cntTimeCloud;
        this.cntTimeQView = cntTimeQView;
        this.cntTimeThumb = cntTimeThumb;
        this.key = key;
        this.logicalfield = logicalfield;
        this.logicalfieldname = logicalfieldname;
        this.logicalfieldstartY = logicalfieldstartY;
        this.logicalfieldendlY = logicalfieldendlY;
        this.logicalfieldstartX = logicalfieldstartX;
        this.logicalfieldendX = logicalfieldendX;
        this.logicalfieldwidth = logicalfieldwidth;
        this.logicalfieldheight = logicalfieldheight;
        this.logicalfieldullongitude = logicalfieldullongitude;
        this.logicalfieldullatitude = logicalfieldullatitude;
        this.logicalfielddrlongitude = logicalfielddrlongitude;
        this.logicalfielddrlatitude = logicalfielddrlatitude;
        this.logicalfielddllongitude = logicalfielddllongitude;
        this.logicalfielddllatitude = logicalfielddllatitude;
        this.logicalfieldlrlongitude = logicalfieldlrlongitude;
        this.logicalfieldlrlatitude = logicalfieldlrlatitude;
        this.logicalfieldcloudcoverage = logicalfieldcloudcoverage;
        this.logicalfieldfiletype = logicalfieldfiletype;
        this.logicalfielddatatype = logicalfielddatatype;
        this.logicalfieldbandsnum = logicalfieldbandsnum;
        this.logicalfieldpath = logicalfieldpath;
        this.quickviewname = quickviewname;
        this.quickviewpath = quickviewpath;
        this.quickviewbands = quickviewbands;
        this.quickviewfiletype = quickviewfiletype;
        this.quickviewresampleratio = quickviewresampleratio;
        this.thumbnailname = thumbnailname;
        this.thumbnailpath = thumbnailpath;
        this.thumbnailbands = thumbnailbands;
        this.thumbnailfiletype = thumbnailfiletype;
        this.thumbnailsampleration = thumbnailsampleration;
        this.overlapratio = overlapratio;
        this.version = version;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MdlPartView _r = null;
        if(rhs instanceof MdlPartView)
        {
            _r = (MdlPartView)rhs;
        }

        if(_r != null)
        {
            if(cntTimePart != _r.cntTimePart)
            {
                return false;
            }
            if(cntTimeCloud != _r.cntTimeCloud)
            {
                return false;
            }
            if(cntTimeQView != _r.cntTimeQView)
            {
                return false;
            }
            if(cntTimeThumb != _r.cntTimeThumb)
            {
                return false;
            }
            if(key != _r.key)
            {
                if(key == null || _r.key == null || !key.equals(_r.key))
                {
                    return false;
                }
            }
            if(logicalfield != _r.logicalfield)
            {
                if(logicalfield == null || _r.logicalfield == null || !logicalfield.equals(_r.logicalfield))
                {
                    return false;
                }
            }
            if(logicalfieldname != _r.logicalfieldname)
            {
                if(logicalfieldname == null || _r.logicalfieldname == null || !logicalfieldname.equals(_r.logicalfieldname))
                {
                    return false;
                }
            }
            if(logicalfieldstartY != _r.logicalfieldstartY)
            {
                return false;
            }
            if(logicalfieldendlY != _r.logicalfieldendlY)
            {
                return false;
            }
            if(logicalfieldstartX != _r.logicalfieldstartX)
            {
                return false;
            }
            if(logicalfieldendX != _r.logicalfieldendX)
            {
                return false;
            }
            if(logicalfieldwidth != _r.logicalfieldwidth)
            {
                return false;
            }
            if(logicalfieldheight != _r.logicalfieldheight)
            {
                return false;
            }
            if(logicalfieldullongitude != _r.logicalfieldullongitude)
            {
                return false;
            }
            if(logicalfieldullatitude != _r.logicalfieldullatitude)
            {
                return false;
            }
            if(logicalfielddrlongitude != _r.logicalfielddrlongitude)
            {
                return false;
            }
            if(logicalfielddrlatitude != _r.logicalfielddrlatitude)
            {
                return false;
            }
            if(logicalfielddllongitude != _r.logicalfielddllongitude)
            {
                return false;
            }
            if(logicalfielddllatitude != _r.logicalfielddllatitude)
            {
                return false;
            }
            if(logicalfieldlrlongitude != _r.logicalfieldlrlongitude)
            {
                return false;
            }
            if(logicalfieldlrlatitude != _r.logicalfieldlrlatitude)
            {
                return false;
            }
            if(logicalfieldcloudcoverage != _r.logicalfieldcloudcoverage)
            {
                return false;
            }
            if(logicalfieldfiletype != _r.logicalfieldfiletype)
            {
                return false;
            }
            if(logicalfielddatatype != _r.logicalfielddatatype)
            {
                return false;
            }
            if(logicalfieldbandsnum != _r.logicalfieldbandsnum)
            {
                return false;
            }
            if(logicalfieldpath != _r.logicalfieldpath)
            {
                if(logicalfieldpath == null || _r.logicalfieldpath == null || !logicalfieldpath.equals(_r.logicalfieldpath))
                {
                    return false;
                }
            }
            if(quickviewname != _r.quickviewname)
            {
                if(quickviewname == null || _r.quickviewname == null || !quickviewname.equals(_r.quickviewname))
                {
                    return false;
                }
            }
            if(quickviewpath != _r.quickviewpath)
            {
                if(quickviewpath == null || _r.quickviewpath == null || !quickviewpath.equals(_r.quickviewpath))
                {
                    return false;
                }
            }
            if(quickviewbands != _r.quickviewbands)
            {
                if(quickviewbands == null || _r.quickviewbands == null || !quickviewbands.equals(_r.quickviewbands))
                {
                    return false;
                }
            }
            if(quickviewfiletype != _r.quickviewfiletype)
            {
                return false;
            }
            if(quickviewresampleratio != _r.quickviewresampleratio)
            {
                return false;
            }
            if(thumbnailname != _r.thumbnailname)
            {
                if(thumbnailname == null || _r.thumbnailname == null || !thumbnailname.equals(_r.thumbnailname))
                {
                    return false;
                }
            }
            if(thumbnailpath != _r.thumbnailpath)
            {
                if(thumbnailpath == null || _r.thumbnailpath == null || !thumbnailpath.equals(_r.thumbnailpath))
                {
                    return false;
                }
            }
            if(thumbnailbands != _r.thumbnailbands)
            {
                if(thumbnailbands == null || _r.thumbnailbands == null || !thumbnailbands.equals(_r.thumbnailbands))
                {
                    return false;
                }
            }
            if(thumbnailfiletype != _r.thumbnailfiletype)
            {
                return false;
            }
            if(thumbnailsampleration != _r.thumbnailsampleration)
            {
                return false;
            }
            if(overlapratio != _r.overlapratio)
            {
                return false;
            }
            if(version != _r.version)
            {
                if(version == null || _r.version == null || !version.equals(_r.version))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCTG2DataStore::MdlPartView");
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimePart);
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimeCloud);
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimeQView);
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimeThumb);
        __h = IceInternal.HashUtil.hashAdd(__h, key);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfield);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldname);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldstartY);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldendlY);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldstartX);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldendX);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldwidth);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldheight);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldullongitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldullatitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfielddrlongitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfielddrlatitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfielddllongitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfielddllatitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldlrlongitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldlrlatitude);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldcloudcoverage);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldfiletype);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfielddatatype);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldbandsnum);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldpath);
        __h = IceInternal.HashUtil.hashAdd(__h, quickviewname);
        __h = IceInternal.HashUtil.hashAdd(__h, quickviewpath);
        __h = IceInternal.HashUtil.hashAdd(__h, quickviewbands);
        __h = IceInternal.HashUtil.hashAdd(__h, quickviewfiletype);
        __h = IceInternal.HashUtil.hashAdd(__h, quickviewresampleratio);
        __h = IceInternal.HashUtil.hashAdd(__h, thumbnailname);
        __h = IceInternal.HashUtil.hashAdd(__h, thumbnailpath);
        __h = IceInternal.HashUtil.hashAdd(__h, thumbnailbands);
        __h = IceInternal.HashUtil.hashAdd(__h, thumbnailfiletype);
        __h = IceInternal.HashUtil.hashAdd(__h, thumbnailsampleration);
        __h = IceInternal.HashUtil.hashAdd(__h, overlapratio);
        __h = IceInternal.HashUtil.hashAdd(__h, version);
        return __h;
    }

    public MdlPartView
    clone()
    {
        MdlPartView c = null;
        try
        {
            c = (MdlPartView)super.clone();
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
        __os.writeDouble(cntTimePart);
        __os.writeDouble(cntTimeCloud);
        __os.writeDouble(cntTimeQView);
        __os.writeDouble(cntTimeThumb);
        __os.writeString(key);
        __os.writeString(logicalfield);
        __os.writeString(logicalfieldname);
        __os.writeInt(logicalfieldstartY);
        __os.writeInt(logicalfieldendlY);
        __os.writeInt(logicalfieldstartX);
        __os.writeInt(logicalfieldendX);
        __os.writeInt(logicalfieldwidth);
        __os.writeInt(logicalfieldheight);
        __os.writeFloat(logicalfieldullongitude);
        __os.writeFloat(logicalfieldullatitude);
        __os.writeFloat(logicalfielddrlongitude);
        __os.writeFloat(logicalfielddrlatitude);
        __os.writeFloat(logicalfielddllongitude);
        __os.writeFloat(logicalfielddllatitude);
        __os.writeFloat(logicalfieldlrlongitude);
        __os.writeFloat(logicalfieldlrlatitude);
        __os.writeFloat(logicalfieldcloudcoverage);
        __os.writeInt(logicalfieldfiletype);
        __os.writeInt(logicalfielddatatype);
        __os.writeInt(logicalfieldbandsnum);
        __os.writeString(logicalfieldpath);
        __os.writeString(quickviewname);
        __os.writeString(quickviewpath);
        __os.writeString(quickviewbands);
        __os.writeInt(quickviewfiletype);
        __os.writeInt(quickviewresampleratio);
        __os.writeString(thumbnailname);
        __os.writeString(thumbnailpath);
        __os.writeString(thumbnailbands);
        __os.writeInt(thumbnailfiletype);
        __os.writeInt(thumbnailsampleration);
        __os.writeFloat(overlapratio);
        __os.writeString(version);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        cntTimePart = __is.readDouble();
        cntTimeCloud = __is.readDouble();
        cntTimeQView = __is.readDouble();
        cntTimeThumb = __is.readDouble();
        key = __is.readString();
        logicalfield = __is.readString();
        logicalfieldname = __is.readString();
        logicalfieldstartY = __is.readInt();
        logicalfieldendlY = __is.readInt();
        logicalfieldstartX = __is.readInt();
        logicalfieldendX = __is.readInt();
        logicalfieldwidth = __is.readInt();
        logicalfieldheight = __is.readInt();
        logicalfieldullongitude = __is.readFloat();
        logicalfieldullatitude = __is.readFloat();
        logicalfielddrlongitude = __is.readFloat();
        logicalfielddrlatitude = __is.readFloat();
        logicalfielddllongitude = __is.readFloat();
        logicalfielddllatitude = __is.readFloat();
        logicalfieldlrlongitude = __is.readFloat();
        logicalfieldlrlatitude = __is.readFloat();
        logicalfieldcloudcoverage = __is.readFloat();
        logicalfieldfiletype = __is.readInt();
        logicalfielddatatype = __is.readInt();
        logicalfieldbandsnum = __is.readInt();
        logicalfieldpath = __is.readString();
        quickviewname = __is.readString();
        quickviewpath = __is.readString();
        quickviewbands = __is.readString();
        quickviewfiletype = __is.readInt();
        quickviewresampleratio = __is.readInt();
        thumbnailname = __is.readString();
        thumbnailpath = __is.readString();
        thumbnailbands = __is.readString();
        thumbnailfiletype = __is.readInt();
        thumbnailsampleration = __is.readInt();
        overlapratio = __is.readFloat();
        version = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, MdlPartView __v)
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

    static public MdlPartView
    __read(IceInternal.BasicStream __is, MdlPartView __v)
    {
        if(__v == null)
        {
             __v = new MdlPartView();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final MdlPartView __nullMarshalValue = new MdlPartView();

    public static final long serialVersionUID = -1200907138L;
}
