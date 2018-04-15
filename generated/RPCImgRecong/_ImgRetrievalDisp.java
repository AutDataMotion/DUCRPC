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
// Generated from file `ImageRetrieveRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCImgRecong;

public abstract class _ImgRetrievalDisp extends Ice.ObjectImpl implements ImgRetrieval
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
        "::RPCImgRecong::ImgRetrieval"
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

    public final WordRes fetchImgSearchResult(java.util.Map<java.lang.String, java.lang.String> mapArg)
    {
        return fetchImgSearchResult(mapArg, null);
    }

    public final int imgSearchAsync(java.util.Map<java.lang.String, java.lang.String> mapArg)
    {
        return imgSearchAsync(mapArg, null);
    }

    public final WordRes imgSearchSync(java.util.Map<java.lang.String, java.lang.String> mapArg)
    {
        return imgSearchSync(mapArg, null);
    }

    public final WordWiki wordGetKnowledge(String word)
    {
        return wordGetKnowledge(word, null);
    }

    public final WordRes wordSearch(java.util.Map<java.lang.String, java.lang.String> mapArg)
    {
        return wordSearch(mapArg, null);
    }

    public final ImgRes wordSearchImg(java.util.Map<java.lang.String, java.lang.String> mapArg)
    {
        return wordSearchImg(mapArg, null);
    }

    public static Ice.DispatchStatus ___wordGetKnowledge(ImgRetrieval __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        String word;
        word = __is.readString();
        __inS.endReadParams();
        WordWiki __ret = __obj.wordGetKnowledge(word, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        WordWiki.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___wordSearch(ImgRetrieval __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArg;
        mapArg = DictStr2StrHelper.read(__is);
        __inS.endReadParams();
        WordRes __ret = __obj.wordSearch(mapArg, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        WordRes.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___wordSearchImg(ImgRetrieval __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArg;
        mapArg = DictStr2StrHelper.read(__is);
        __inS.endReadParams();
        ImgRes __ret = __obj.wordSearchImg(mapArg, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        ImgRes.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___imgSearchAsync(ImgRetrieval __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArg;
        mapArg = DictStr2StrHelper.read(__is);
        __inS.endReadParams();
        int __ret = __obj.imgSearchAsync(mapArg, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeInt(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___fetchImgSearchResult(ImgRetrieval __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArg;
        mapArg = DictStr2StrHelper.read(__is);
        __inS.endReadParams();
        WordRes __ret = __obj.fetchImgSearchResult(mapArg, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        WordRes.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___imgSearchSync(ImgRetrieval __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        java.util.Map<java.lang.String, java.lang.String> mapArg;
        mapArg = DictStr2StrHelper.read(__is);
        __inS.endReadParams();
        WordRes __ret = __obj.imgSearchSync(mapArg, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        WordRes.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "fetchImgSearchResult",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "imgSearchAsync",
        "imgSearchSync",
        "wordGetKnowledge",
        "wordSearch",
        "wordSearchImg"
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
                return ___fetchImgSearchResult(this, in, __current);
            }
            case 1:
            {
                return ___ice_id(this, in, __current);
            }
            case 2:
            {
                return ___ice_ids(this, in, __current);
            }
            case 3:
            {
                return ___ice_isA(this, in, __current);
            }
            case 4:
            {
                return ___ice_ping(this, in, __current);
            }
            case 5:
            {
                return ___imgSearchAsync(this, in, __current);
            }
            case 6:
            {
                return ___imgSearchSync(this, in, __current);
            }
            case 7:
            {
                return ___wordGetKnowledge(this, in, __current);
            }
            case 8:
            {
                return ___wordSearch(this, in, __current);
            }
            case 9:
            {
                return ___wordSearchImg(this, in, __current);
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