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

public interface InfRicePrx extends Ice.ObjectPrx
{
    public String PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public String PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Callback __cb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, Callback_InfRice_PreProcessing __cb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Callback_InfRice_PreProcessing __cb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, 
                                               java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                               IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, 
                                               java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                               IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, 
                                               java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_PreProcessing(PreProcess inputfile, 
                                               java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb);

    public String end_PreProcessing(Ice.AsyncResult __result);

    public String maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public String maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Callback __cb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, Callback_InfRice_maxlikehood __cb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Callback_InfRice_maxlikehood __cb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_maxlikehood(ClassifyA inputclass, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public String end_maxlikehood(Ice.AsyncResult __result);

    public String split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public String split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Callback __cb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, Callback_InfRice_split __cb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Callback_InfRice_split __cb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, 
                                       java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, 
                                       java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, 
                                       java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_split(ClassifyB inputclass, 
                                       java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb);

    public String end_split(Ice.AsyncResult __result);

    public String ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public String ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Callback __cb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, Callback_InfRice_ricegrowth __cb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Callback_InfRice_ricegrowth __cb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, 
                                            java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, 
                                            java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, 
                                            java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_ricegrowth(Growth inputGrowth, 
                                            java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                            java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb);

    public String end_ricegrowth(Ice.AsyncResult __result);

    public String landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public String landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public Ice.AsyncResult begin_landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Callback __cb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, Callback_InfRice_landyield __cb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Callback_InfRice_landyield __cb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, 
                                           java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                           IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, 
                                           java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                           IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, 
                                           java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_landyield(Yield inputyield, 
                                           java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb);

    public String end_landyield(Ice.AsyncResult __result);

    public String landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public String landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Callback __cb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, Callback_InfRice_landdrought __cb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, java.util.Map<java.lang.String, java.lang.String> mapArgs, java.util.Map<String, String> __ctx, Callback_InfRice_landdrought __cb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_landdrought(Drought inputdrought, 
                                             java.util.Map<java.lang.String, java.lang.String> mapArgs, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public String end_landdrought(Ice.AsyncResult __result);
}
