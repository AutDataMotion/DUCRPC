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
// Generated from file `wisefuseRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCWiseFuse;

public abstract class _WiseFusionInfDisp extends Ice.ObjectImpl implements WiseFusionInf
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::RPCWiseFuse::WiseFusionInf"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public final String askProcess(java.util.Map<java.lang.String, java.lang.String> mapArgs)
    {
        return askProcess(mapArgs, null);
    }

    public final FusionInf fetchFuseRes(java.util.Map<java.lang.String, java.lang.String> mapArg)
    {
        return fetchFuseRes(mapArg, null);
    }

    public final int fuseAsyn(java.util.Map<java.lang.String, java.lang.String> mapArgs)
    {
        return fuseAsyn(mapArgs, null);
    }

    public final FusionInf fuseSyn(java.util.Map<java.lang.String, java.lang.String> mapArgs)
    {
        return fuseSyn(mapArgs, null);
    }

    public final boolean geneThumbImg(String inPath, String outPath, String bandlist)
    {
        return geneThumbImg(inPath, outPath, bandlist, null);
    }

    public static Ice.DispatchStatus ___geneThumbImg(WiseFusionInf __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        String inPath;
        String outPath;
        String bandlist;
        inPath = __is.readString();
        outPath = __is.readString();
        bandlist = __is.readString();
        __inS.endReadParams();
        boolean __ret = __obj.geneThumbImg(inPath, outPath, bandlist, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeBool(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___fuseSyn(WiseFusionInf __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArgs;
        mapArgs = DirArgsHelper.read(__is);
        __inS.endReadParams();
        FusionInf __ret = __obj.fuseSyn(mapArgs, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        FusionInf.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___fuseAsyn(WiseFusionInf __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArgs;
        mapArgs = DirArgsHelper.read(__is);
        __inS.endReadParams();
        int __ret = __obj.fuseAsyn(mapArgs, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeInt(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___askProcess(WiseFusionInf __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArgs;
        mapArgs = DirArgsHelper.read(__is);
        __inS.endReadParams();
        String __ret = __obj.askProcess(mapArgs, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeString(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___fetchFuseRes(WiseFusionInf __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArg;
        mapArg = DirArgsHelper.read(__is);
        __inS.endReadParams();
        FusionInf __ret = __obj.fetchFuseRes(mapArg, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        FusionInf.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "askProcess",
        "fetchFuseRes",
        "fuseAsyn",
        "fuseSyn",
        "geneThumbImg",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___askProcess(this, in, __current);
            }
            case 1:
            {
                return ___fetchFuseRes(this, in, __current);
            }
            case 2:
            {
                return ___fuseAsyn(this, in, __current);
            }
            case 3:
            {
                return ___fuseSyn(this, in, __current);
            }
            case 4:
            {
                return ___geneThumbImg(this, in, __current);
            }
            case 5:
            {
                return ___ice_id(this, in, __current);
            }
            case 6:
            {
                return ___ice_ids(this, in, __current);
            }
            case 7:
            {
                return ___ice_isA(this, in, __current);
            }
            case 8:
            {
                return ___ice_ping(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}