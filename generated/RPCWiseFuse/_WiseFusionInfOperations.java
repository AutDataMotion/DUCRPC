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
// Generated from file `wisefuseRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCWiseFuse;

public interface _WiseFusionInfOperations
{
    boolean geneThumbImg(String inPath, String outPath, String bandlist, Ice.Current __current);

    FusionInf fuseSyn(java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    int fuseAsyn(java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    String askProcess(java.util.Map<java.lang.String, java.lang.String> mapArgs, Ice.Current __current);

    FusionInf fetchFuseRes(java.util.Map<java.lang.String, java.lang.String> mapArg, Ice.Current __current);
}
