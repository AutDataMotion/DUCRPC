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

public class IALTInfo implements java.lang.Cloneable, java.io.Serializable
{
    public boolean isGenQView;

    public double cntTimeInfo;

    public double cntTimeQView;

    public double cntTimeThumb;

    public String aircraft;

    public String sensorname;

    public String filename0B;

    public String segmentID;

    public String dividestyle;

    public String logicalfield;

    public String Logicalfieldtype;

    public int productlevel;

    public String producttype;

    public int channel;

    public int band;

    public String mode;

    public int bitsperpixel;

    public float raspatialresolution;

    public float azspatialresolution;

    public int width;

    public int height;

    public int logicalfieldstarty;

    public int logicalfieldendly;

    public int logicalfieldstartx;

    public int logicalfieldendx;

    public int logicalfieldwidth;

    public int logicalfieldheight;

    public double logicalfieldullongitude;

    public double logicalfieldullatitude;

    public double logicalfielddrlongitude;

    public double logicalfielddrlatitude;

    public double logicalfielddllongitude;

    public double logicalfielddllatitude;

    public double logicalfieldlrlongitude;

    public double logicalfieldlrlatitude;

    public String projectiontype;

    public String datumname;

    public String proj4code;

    public String projectionunits;

    public float projcentralmeridian;

    public String productname;

    public String datapath;

    public String imagequalityflag;

    public int status;

    public String timadd;

    public String logicalfieldProducttime;

    public boolean relcalib;

    public boolean abscalib;

    public boolean sysgeocor;

    public String processmodel;

    public String QuickviewName;

    public String Quickviewpath;

    public int QuickViewResampleRatio;

    public String ThumbnailName;

    public String Thumbnailpath;

    public int Thumbnailsampleration;

    public float OverlapRatio;

    public String pol;

    public float samplerate;

    public float bandwidth;

    public IALTInfo()
    {
        aircraft = "";
        sensorname = "";
        filename0B = "";
        segmentID = "";
        dividestyle = "";
        logicalfield = "";
        Logicalfieldtype = "";
        producttype = "";
        mode = "";
        projectiontype = "";
        datumname = "";
        proj4code = "";
        projectionunits = "";
        productname = "";
        datapath = "";
        imagequalityflag = "";
        timadd = "";
        logicalfieldProducttime = "";
        processmodel = "";
        QuickviewName = "";
        Quickviewpath = "";
        ThumbnailName = "";
        Thumbnailpath = "";
        pol = "";
    }

    public IALTInfo(boolean isGenQView, double cntTimeInfo, double cntTimeQView, double cntTimeThumb, String aircraft, String sensorname, String filename0B, String segmentID, String dividestyle, String logicalfield, String Logicalfieldtype, int productlevel, String producttype, int channel, int band, String mode, int bitsperpixel, float raspatialresolution, float azspatialresolution, int width, int height, int logicalfieldstarty, int logicalfieldendly, int logicalfieldstartx, int logicalfieldendx, int logicalfieldwidth, int logicalfieldheight, double logicalfieldullongitude, double logicalfieldullatitude, double logicalfielddrlongitude, double logicalfielddrlatitude, double logicalfielddllongitude, double logicalfielddllatitude, double logicalfieldlrlongitude, double logicalfieldlrlatitude, String projectiontype, String datumname, String proj4code, String projectionunits, float projcentralmeridian, String productname, String datapath, String imagequalityflag, int status, String timadd, String logicalfieldProducttime, boolean relcalib, boolean abscalib, boolean sysgeocor, String processmodel, String QuickviewName, String Quickviewpath, int QuickViewResampleRatio, String ThumbnailName, String Thumbnailpath, int Thumbnailsampleration, float OverlapRatio, String pol, float samplerate, float bandwidth)
    {
        this.isGenQView = isGenQView;
        this.cntTimeInfo = cntTimeInfo;
        this.cntTimeQView = cntTimeQView;
        this.cntTimeThumb = cntTimeThumb;
        this.aircraft = aircraft;
        this.sensorname = sensorname;
        this.filename0B = filename0B;
        this.segmentID = segmentID;
        this.dividestyle = dividestyle;
        this.logicalfield = logicalfield;
        this.Logicalfieldtype = Logicalfieldtype;
        this.productlevel = productlevel;
        this.producttype = producttype;
        this.channel = channel;
        this.band = band;
        this.mode = mode;
        this.bitsperpixel = bitsperpixel;
        this.raspatialresolution = raspatialresolution;
        this.azspatialresolution = azspatialresolution;
        this.width = width;
        this.height = height;
        this.logicalfieldstarty = logicalfieldstarty;
        this.logicalfieldendly = logicalfieldendly;
        this.logicalfieldstartx = logicalfieldstartx;
        this.logicalfieldendx = logicalfieldendx;
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
        this.projectiontype = projectiontype;
        this.datumname = datumname;
        this.proj4code = proj4code;
        this.projectionunits = projectionunits;
        this.projcentralmeridian = projcentralmeridian;
        this.productname = productname;
        this.datapath = datapath;
        this.imagequalityflag = imagequalityflag;
        this.status = status;
        this.timadd = timadd;
        this.logicalfieldProducttime = logicalfieldProducttime;
        this.relcalib = relcalib;
        this.abscalib = abscalib;
        this.sysgeocor = sysgeocor;
        this.processmodel = processmodel;
        this.QuickviewName = QuickviewName;
        this.Quickviewpath = Quickviewpath;
        this.QuickViewResampleRatio = QuickViewResampleRatio;
        this.ThumbnailName = ThumbnailName;
        this.Thumbnailpath = Thumbnailpath;
        this.Thumbnailsampleration = Thumbnailsampleration;
        this.OverlapRatio = OverlapRatio;
        this.pol = pol;
        this.samplerate = samplerate;
        this.bandwidth = bandwidth;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        IALTInfo _r = null;
        if(rhs instanceof IALTInfo)
        {
            _r = (IALTInfo)rhs;
        }

        if(_r != null)
        {
            if(isGenQView != _r.isGenQView)
            {
                return false;
            }
            if(cntTimeInfo != _r.cntTimeInfo)
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
            if(aircraft != _r.aircraft)
            {
                if(aircraft == null || _r.aircraft == null || !aircraft.equals(_r.aircraft))
                {
                    return false;
                }
            }
            if(sensorname != _r.sensorname)
            {
                if(sensorname == null || _r.sensorname == null || !sensorname.equals(_r.sensorname))
                {
                    return false;
                }
            }
            if(filename0B != _r.filename0B)
            {
                if(filename0B == null || _r.filename0B == null || !filename0B.equals(_r.filename0B))
                {
                    return false;
                }
            }
            if(segmentID != _r.segmentID)
            {
                if(segmentID == null || _r.segmentID == null || !segmentID.equals(_r.segmentID))
                {
                    return false;
                }
            }
            if(dividestyle != _r.dividestyle)
            {
                if(dividestyle == null || _r.dividestyle == null || !dividestyle.equals(_r.dividestyle))
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
            if(Logicalfieldtype != _r.Logicalfieldtype)
            {
                if(Logicalfieldtype == null || _r.Logicalfieldtype == null || !Logicalfieldtype.equals(_r.Logicalfieldtype))
                {
                    return false;
                }
            }
            if(productlevel != _r.productlevel)
            {
                return false;
            }
            if(producttype != _r.producttype)
            {
                if(producttype == null || _r.producttype == null || !producttype.equals(_r.producttype))
                {
                    return false;
                }
            }
            if(channel != _r.channel)
            {
                return false;
            }
            if(band != _r.band)
            {
                return false;
            }
            if(mode != _r.mode)
            {
                if(mode == null || _r.mode == null || !mode.equals(_r.mode))
                {
                    return false;
                }
            }
            if(bitsperpixel != _r.bitsperpixel)
            {
                return false;
            }
            if(raspatialresolution != _r.raspatialresolution)
            {
                return false;
            }
            if(azspatialresolution != _r.azspatialresolution)
            {
                return false;
            }
            if(width != _r.width)
            {
                return false;
            }
            if(height != _r.height)
            {
                return false;
            }
            if(logicalfieldstarty != _r.logicalfieldstarty)
            {
                return false;
            }
            if(logicalfieldendly != _r.logicalfieldendly)
            {
                return false;
            }
            if(logicalfieldstartx != _r.logicalfieldstartx)
            {
                return false;
            }
            if(logicalfieldendx != _r.logicalfieldendx)
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
            if(projectiontype != _r.projectiontype)
            {
                if(projectiontype == null || _r.projectiontype == null || !projectiontype.equals(_r.projectiontype))
                {
                    return false;
                }
            }
            if(datumname != _r.datumname)
            {
                if(datumname == null || _r.datumname == null || !datumname.equals(_r.datumname))
                {
                    return false;
                }
            }
            if(proj4code != _r.proj4code)
            {
                if(proj4code == null || _r.proj4code == null || !proj4code.equals(_r.proj4code))
                {
                    return false;
                }
            }
            if(projectionunits != _r.projectionunits)
            {
                if(projectionunits == null || _r.projectionunits == null || !projectionunits.equals(_r.projectionunits))
                {
                    return false;
                }
            }
            if(projcentralmeridian != _r.projcentralmeridian)
            {
                return false;
            }
            if(productname != _r.productname)
            {
                if(productname == null || _r.productname == null || !productname.equals(_r.productname))
                {
                    return false;
                }
            }
            if(datapath != _r.datapath)
            {
                if(datapath == null || _r.datapath == null || !datapath.equals(_r.datapath))
                {
                    return false;
                }
            }
            if(imagequalityflag != _r.imagequalityflag)
            {
                if(imagequalityflag == null || _r.imagequalityflag == null || !imagequalityflag.equals(_r.imagequalityflag))
                {
                    return false;
                }
            }
            if(status != _r.status)
            {
                return false;
            }
            if(timadd != _r.timadd)
            {
                if(timadd == null || _r.timadd == null || !timadd.equals(_r.timadd))
                {
                    return false;
                }
            }
            if(logicalfieldProducttime != _r.logicalfieldProducttime)
            {
                if(logicalfieldProducttime == null || _r.logicalfieldProducttime == null || !logicalfieldProducttime.equals(_r.logicalfieldProducttime))
                {
                    return false;
                }
            }
            if(relcalib != _r.relcalib)
            {
                return false;
            }
            if(abscalib != _r.abscalib)
            {
                return false;
            }
            if(sysgeocor != _r.sysgeocor)
            {
                return false;
            }
            if(processmodel != _r.processmodel)
            {
                if(processmodel == null || _r.processmodel == null || !processmodel.equals(_r.processmodel))
                {
                    return false;
                }
            }
            if(QuickviewName != _r.QuickviewName)
            {
                if(QuickviewName == null || _r.QuickviewName == null || !QuickviewName.equals(_r.QuickviewName))
                {
                    return false;
                }
            }
            if(Quickviewpath != _r.Quickviewpath)
            {
                if(Quickviewpath == null || _r.Quickviewpath == null || !Quickviewpath.equals(_r.Quickviewpath))
                {
                    return false;
                }
            }
            if(QuickViewResampleRatio != _r.QuickViewResampleRatio)
            {
                return false;
            }
            if(ThumbnailName != _r.ThumbnailName)
            {
                if(ThumbnailName == null || _r.ThumbnailName == null || !ThumbnailName.equals(_r.ThumbnailName))
                {
                    return false;
                }
            }
            if(Thumbnailpath != _r.Thumbnailpath)
            {
                if(Thumbnailpath == null || _r.Thumbnailpath == null || !Thumbnailpath.equals(_r.Thumbnailpath))
                {
                    return false;
                }
            }
            if(Thumbnailsampleration != _r.Thumbnailsampleration)
            {
                return false;
            }
            if(OverlapRatio != _r.OverlapRatio)
            {
                return false;
            }
            if(pol != _r.pol)
            {
                if(pol == null || _r.pol == null || !pol.equals(_r.pol))
                {
                    return false;
                }
            }
            if(samplerate != _r.samplerate)
            {
                return false;
            }
            if(bandwidth != _r.bandwidth)
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCTG2DataStore::IALTInfo");
        __h = IceInternal.HashUtil.hashAdd(__h, isGenQView);
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimeInfo);
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimeQView);
        __h = IceInternal.HashUtil.hashAdd(__h, cntTimeThumb);
        __h = IceInternal.HashUtil.hashAdd(__h, aircraft);
        __h = IceInternal.HashUtil.hashAdd(__h, sensorname);
        __h = IceInternal.HashUtil.hashAdd(__h, filename0B);
        __h = IceInternal.HashUtil.hashAdd(__h, segmentID);
        __h = IceInternal.HashUtil.hashAdd(__h, dividestyle);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfield);
        __h = IceInternal.HashUtil.hashAdd(__h, Logicalfieldtype);
        __h = IceInternal.HashUtil.hashAdd(__h, productlevel);
        __h = IceInternal.HashUtil.hashAdd(__h, producttype);
        __h = IceInternal.HashUtil.hashAdd(__h, channel);
        __h = IceInternal.HashUtil.hashAdd(__h, band);
        __h = IceInternal.HashUtil.hashAdd(__h, mode);
        __h = IceInternal.HashUtil.hashAdd(__h, bitsperpixel);
        __h = IceInternal.HashUtil.hashAdd(__h, raspatialresolution);
        __h = IceInternal.HashUtil.hashAdd(__h, azspatialresolution);
        __h = IceInternal.HashUtil.hashAdd(__h, width);
        __h = IceInternal.HashUtil.hashAdd(__h, height);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldstarty);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldendly);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldstartx);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldendx);
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
        __h = IceInternal.HashUtil.hashAdd(__h, projectiontype);
        __h = IceInternal.HashUtil.hashAdd(__h, datumname);
        __h = IceInternal.HashUtil.hashAdd(__h, proj4code);
        __h = IceInternal.HashUtil.hashAdd(__h, projectionunits);
        __h = IceInternal.HashUtil.hashAdd(__h, projcentralmeridian);
        __h = IceInternal.HashUtil.hashAdd(__h, productname);
        __h = IceInternal.HashUtil.hashAdd(__h, datapath);
        __h = IceInternal.HashUtil.hashAdd(__h, imagequalityflag);
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        __h = IceInternal.HashUtil.hashAdd(__h, timadd);
        __h = IceInternal.HashUtil.hashAdd(__h, logicalfieldProducttime);
        __h = IceInternal.HashUtil.hashAdd(__h, relcalib);
        __h = IceInternal.HashUtil.hashAdd(__h, abscalib);
        __h = IceInternal.HashUtil.hashAdd(__h, sysgeocor);
        __h = IceInternal.HashUtil.hashAdd(__h, processmodel);
        __h = IceInternal.HashUtil.hashAdd(__h, QuickviewName);
        __h = IceInternal.HashUtil.hashAdd(__h, Quickviewpath);
        __h = IceInternal.HashUtil.hashAdd(__h, QuickViewResampleRatio);
        __h = IceInternal.HashUtil.hashAdd(__h, ThumbnailName);
        __h = IceInternal.HashUtil.hashAdd(__h, Thumbnailpath);
        __h = IceInternal.HashUtil.hashAdd(__h, Thumbnailsampleration);
        __h = IceInternal.HashUtil.hashAdd(__h, OverlapRatio);
        __h = IceInternal.HashUtil.hashAdd(__h, pol);
        __h = IceInternal.HashUtil.hashAdd(__h, samplerate);
        __h = IceInternal.HashUtil.hashAdd(__h, bandwidth);
        return __h;
    }

    public IALTInfo
    clone()
    {
        IALTInfo c = null;
        try
        {
            c = (IALTInfo)super.clone();
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
        __os.writeBool(isGenQView);
        __os.writeDouble(cntTimeInfo);
        __os.writeDouble(cntTimeQView);
        __os.writeDouble(cntTimeThumb);
        __os.writeString(aircraft);
        __os.writeString(sensorname);
        __os.writeString(filename0B);
        __os.writeString(segmentID);
        __os.writeString(dividestyle);
        __os.writeString(logicalfield);
        __os.writeString(Logicalfieldtype);
        __os.writeInt(productlevel);
        __os.writeString(producttype);
        __os.writeInt(channel);
        __os.writeInt(band);
        __os.writeString(mode);
        __os.writeInt(bitsperpixel);
        __os.writeFloat(raspatialresolution);
        __os.writeFloat(azspatialresolution);
        __os.writeInt(width);
        __os.writeInt(height);
        __os.writeInt(logicalfieldstarty);
        __os.writeInt(logicalfieldendly);
        __os.writeInt(logicalfieldstartx);
        __os.writeInt(logicalfieldendx);
        __os.writeInt(logicalfieldwidth);
        __os.writeInt(logicalfieldheight);
        __os.writeDouble(logicalfieldullongitude);
        __os.writeDouble(logicalfieldullatitude);
        __os.writeDouble(logicalfielddrlongitude);
        __os.writeDouble(logicalfielddrlatitude);
        __os.writeDouble(logicalfielddllongitude);
        __os.writeDouble(logicalfielddllatitude);
        __os.writeDouble(logicalfieldlrlongitude);
        __os.writeDouble(logicalfieldlrlatitude);
        __os.writeString(projectiontype);
        __os.writeString(datumname);
        __os.writeString(proj4code);
        __os.writeString(projectionunits);
        __os.writeFloat(projcentralmeridian);
        __os.writeString(productname);
        __os.writeString(datapath);
        __os.writeString(imagequalityflag);
        __os.writeInt(status);
        __os.writeString(timadd);
        __os.writeString(logicalfieldProducttime);
        __os.writeBool(relcalib);
        __os.writeBool(abscalib);
        __os.writeBool(sysgeocor);
        __os.writeString(processmodel);
        __os.writeString(QuickviewName);
        __os.writeString(Quickviewpath);
        __os.writeInt(QuickViewResampleRatio);
        __os.writeString(ThumbnailName);
        __os.writeString(Thumbnailpath);
        __os.writeInt(Thumbnailsampleration);
        __os.writeFloat(OverlapRatio);
        __os.writeString(pol);
        __os.writeFloat(samplerate);
        __os.writeFloat(bandwidth);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        isGenQView = __is.readBool();
        cntTimeInfo = __is.readDouble();
        cntTimeQView = __is.readDouble();
        cntTimeThumb = __is.readDouble();
        aircraft = __is.readString();
        sensorname = __is.readString();
        filename0B = __is.readString();
        segmentID = __is.readString();
        dividestyle = __is.readString();
        logicalfield = __is.readString();
        Logicalfieldtype = __is.readString();
        productlevel = __is.readInt();
        producttype = __is.readString();
        channel = __is.readInt();
        band = __is.readInt();
        mode = __is.readString();
        bitsperpixel = __is.readInt();
        raspatialresolution = __is.readFloat();
        azspatialresolution = __is.readFloat();
        width = __is.readInt();
        height = __is.readInt();
        logicalfieldstarty = __is.readInt();
        logicalfieldendly = __is.readInt();
        logicalfieldstartx = __is.readInt();
        logicalfieldendx = __is.readInt();
        logicalfieldwidth = __is.readInt();
        logicalfieldheight = __is.readInt();
        logicalfieldullongitude = __is.readDouble();
        logicalfieldullatitude = __is.readDouble();
        logicalfielddrlongitude = __is.readDouble();
        logicalfielddrlatitude = __is.readDouble();
        logicalfielddllongitude = __is.readDouble();
        logicalfielddllatitude = __is.readDouble();
        logicalfieldlrlongitude = __is.readDouble();
        logicalfieldlrlatitude = __is.readDouble();
        projectiontype = __is.readString();
        datumname = __is.readString();
        proj4code = __is.readString();
        projectionunits = __is.readString();
        projcentralmeridian = __is.readFloat();
        productname = __is.readString();
        datapath = __is.readString();
        imagequalityflag = __is.readString();
        status = __is.readInt();
        timadd = __is.readString();
        logicalfieldProducttime = __is.readString();
        relcalib = __is.readBool();
        abscalib = __is.readBool();
        sysgeocor = __is.readBool();
        processmodel = __is.readString();
        QuickviewName = __is.readString();
        Quickviewpath = __is.readString();
        QuickViewResampleRatio = __is.readInt();
        ThumbnailName = __is.readString();
        Thumbnailpath = __is.readString();
        Thumbnailsampleration = __is.readInt();
        OverlapRatio = __is.readFloat();
        pol = __is.readString();
        samplerate = __is.readFloat();
        bandwidth = __is.readFloat();
    }

    static public void
    __write(IceInternal.BasicStream __os, IALTInfo __v)
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

    static public IALTInfo
    __read(IceInternal.BasicStream __is, IALTInfo __v)
    {
        if(__v == null)
        {
             __v = new IALTInfo();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final IALTInfo __nullMarshalValue = new IALTInfo();

    public static final long serialVersionUID = 3155024806164048375L;
}