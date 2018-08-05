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
// Generated from file `qualityjudgeRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCQualityJudge;

/**
 * Provides type-specific helper functions.
 **/
public final class QualityInfPrxHelper extends Ice.ObjectPrxHelperBase implements QualityInfPrx
{
    private static final String __fetchQualityRes_name = "fetchQualityRes";

    public QualityInfo fetchQualityRes(String inputArgs)
    {
        return fetchQualityRes(inputArgs, null, false);
    }

    public QualityInfo fetchQualityRes(String inputArgs, java.util.Map<String, String> __ctx)
    {
        return fetchQualityRes(inputArgs, __ctx, true);
    }

    private QualityInfo fetchQualityRes(String inputArgs, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__fetchQualityRes_name);
        return end_fetchQualityRes(begin_fetchQualityRes(inputArgs, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs)
    {
        return begin_fetchQualityRes(inputArgs, null, false, false, null);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, java.util.Map<String, String> __ctx)
    {
        return begin_fetchQualityRes(inputArgs, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, Ice.Callback __cb)
    {
        return begin_fetchQualityRes(inputArgs, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_fetchQualityRes(inputArgs, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, Callback_QualityInf_fetchQualityRes __cb)
    {
        return begin_fetchQualityRes(inputArgs, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, java.util.Map<String, String> __ctx, Callback_QualityInf_fetchQualityRes __cb)
    {
        return begin_fetchQualityRes(inputArgs, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, 
                                                 IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_fetchQualityRes(inputArgs, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, 
                                                 IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_fetchQualityRes(inputArgs, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, 
                                                 java.util.Map<String, String> __ctx, 
                                                 IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_fetchQualityRes(inputArgs, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_fetchQualityRes(String inputArgs, 
                                                 java.util.Map<String, String> __ctx, 
                                                 IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_fetchQualityRes(inputArgs, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_fetchQualityRes(String inputArgs, 
                                                  java.util.Map<String, String> __ctx, 
                                                  boolean __explicitCtx, 
                                                  boolean __synchronous, 
                                                  IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_fetchQualityRes(inputArgs, __ctx, __explicitCtx, __synchronous, 
                                     new IceInternal.Functional_TwowayCallbackArg1<RPCQualityJudge.QualityInfo>(__responseCb, __exceptionCb, __sentCb)
                                         {
                                             public final void __completed(Ice.AsyncResult __result)
                                             {
                                                 QualityInfPrxHelper.__fetchQualityRes_completed(this, __result);
                                             }
                                         });
    }

    private Ice.AsyncResult begin_fetchQualityRes(String inputArgs, 
                                                  java.util.Map<String, String> __ctx, 
                                                  boolean __explicitCtx, 
                                                  boolean __synchronous, 
                                                  IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__fetchQualityRes_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__fetchQualityRes_name, __cb);
        try
        {
            __result.prepare(__fetchQualityRes_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(inputArgs);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public QualityInfo end_fetchQualityRes(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __fetchQualityRes_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            QualityInfo __ret = null;
            __ret = QualityInfo.__read(__is, __ret);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __fetchQualityRes_completed(Ice.TwowayCallbackArg1<QualityInfo> __cb, Ice.AsyncResult __result)
    {
        RPCQualityJudge.QualityInfPrx __proxy = (RPCQualityJudge.QualityInfPrx)__result.getProxy();
        QualityInfo __ret = null;
        try
        {
            __ret = __proxy.end_fetchQualityRes(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __qualityAsyn_name = "qualityAsyn";

    public int qualityAsyn(QualityInputStruct inputArgs)
    {
        return qualityAsyn(inputArgs, null, false);
    }

    public int qualityAsyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx)
    {
        return qualityAsyn(inputArgs, __ctx, true);
    }

    private int qualityAsyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__qualityAsyn_name);
        return end_qualityAsyn(begin_qualityAsyn(inputArgs, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs)
    {
        return begin_qualityAsyn(inputArgs, null, false, false, null);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx)
    {
        return begin_qualityAsyn(inputArgs, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, Ice.Callback __cb)
    {
        return begin_qualityAsyn(inputArgs, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_qualityAsyn(inputArgs, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, Callback_QualityInf_qualityAsyn __cb)
    {
        return begin_qualityAsyn(inputArgs, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx, Callback_QualityInf_qualityAsyn __cb)
    {
        return begin_qualityAsyn(inputArgs, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, 
                                             IceInternal.Functional_IntCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_qualityAsyn(inputArgs, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, 
                                             IceInternal.Functional_IntCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_qualityAsyn(inputArgs, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_IntCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_qualityAsyn(inputArgs, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_IntCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_qualityAsyn(inputArgs, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_IntCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_qualityAsyn(inputArgs, __ctx, __explicitCtx, __synchronous, 
                                 new IceInternal.Functional_TwowayCallbackInt(__responseCb, __exceptionCb, __sentCb)
                                     {
                                         public final void __completed(Ice.AsyncResult __result)
                                         {
                                             QualityInfPrxHelper.__qualityAsyn_completed(this, __result);
                                         }
                                     });
    }

    private Ice.AsyncResult begin_qualityAsyn(QualityInputStruct inputArgs, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__qualityAsyn_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__qualityAsyn_name, __cb);
        try
        {
            __result.prepare(__qualityAsyn_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            QualityInputStruct.__write(__os, inputArgs);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public int end_qualityAsyn(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __qualityAsyn_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __qualityAsyn_completed(Ice.TwowayCallbackInt __cb, Ice.AsyncResult __result)
    {
        RPCQualityJudge.QualityInfPrx __proxy = (RPCQualityJudge.QualityInfPrx)__result.getProxy();
        int __ret = 0;
        try
        {
            __ret = __proxy.end_qualityAsyn(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __qualitySyn_name = "qualitySyn";

    public QualityInfo qualitySyn(QualityInputStruct inputArgs)
    {
        return qualitySyn(inputArgs, null, false);
    }

    public QualityInfo qualitySyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx)
    {
        return qualitySyn(inputArgs, __ctx, true);
    }

    private QualityInfo qualitySyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__qualitySyn_name);
        return end_qualitySyn(begin_qualitySyn(inputArgs, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs)
    {
        return begin_qualitySyn(inputArgs, null, false, false, null);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx)
    {
        return begin_qualitySyn(inputArgs, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, Ice.Callback __cb)
    {
        return begin_qualitySyn(inputArgs, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_qualitySyn(inputArgs, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, Callback_QualityInf_qualitySyn __cb)
    {
        return begin_qualitySyn(inputArgs, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, java.util.Map<String, String> __ctx, Callback_QualityInf_qualitySyn __cb)
    {
        return begin_qualitySyn(inputArgs, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, 
                                            IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_qualitySyn(inputArgs, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, 
                                            IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_qualitySyn(inputArgs, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_qualitySyn(inputArgs, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_qualitySyn(inputArgs, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.Functional_GenericCallback1<QualityInfo> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_qualitySyn(inputArgs, __ctx, __explicitCtx, __synchronous, 
                                new IceInternal.Functional_TwowayCallbackArg1<RPCQualityJudge.QualityInfo>(__responseCb, __exceptionCb, __sentCb)
                                    {
                                        public final void __completed(Ice.AsyncResult __result)
                                        {
                                            QualityInfPrxHelper.__qualitySyn_completed(this, __result);
                                        }
                                    });
    }

    private Ice.AsyncResult begin_qualitySyn(QualityInputStruct inputArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__qualitySyn_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__qualitySyn_name, __cb);
        try
        {
            __result.prepare(__qualitySyn_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            QualityInputStruct.__write(__os, inputArgs);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public QualityInfo end_qualitySyn(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __qualitySyn_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            QualityInfo __ret = null;
            __ret = QualityInfo.__read(__is, __ret);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __qualitySyn_completed(Ice.TwowayCallbackArg1<QualityInfo> __cb, Ice.AsyncResult __result)
    {
        RPCQualityJudge.QualityInfPrx __proxy = (RPCQualityJudge.QualityInfPrx)__result.getProxy();
        QualityInfo __ret = null;
        try
        {
            __ret = __proxy.end_qualitySyn(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static QualityInfPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), QualityInfPrx.class, QualityInfPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static QualityInfPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), QualityInfPrx.class, QualityInfPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static QualityInfPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), QualityInfPrx.class, QualityInfPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static QualityInfPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), QualityInfPrx.class, QualityInfPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static QualityInfPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, QualityInfPrx.class, QualityInfPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static QualityInfPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, QualityInfPrx.class, QualityInfPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::RPCQualityJudge::QualityInf"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, QualityInfPrx v)
    {
        __os.writeProxy(v);
    }

    public static QualityInfPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            QualityInfPrxHelper result = new QualityInfPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
