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
// Generated from file `ImageRetrieveRpc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RPCImgRecong;

public class WordWiki implements java.lang.Cloneable, java.io.Serializable
{
    public String key;

    public String abstr;

    public String descr;

    public WordWiki()
    {
        key = "";
        abstr = "";
        descr = "";
    }

    public WordWiki(String key, String abstr, String descr)
    {
        this.key = key;
        this.abstr = abstr;
        this.descr = descr;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        WordWiki _r = null;
        if(rhs instanceof WordWiki)
        {
            _r = (WordWiki)rhs;
        }

        if(_r != null)
        {
            if(key != _r.key)
            {
                if(key == null || _r.key == null || !key.equals(_r.key))
                {
                    return false;
                }
            }
            if(abstr != _r.abstr)
            {
                if(abstr == null || _r.abstr == null || !abstr.equals(_r.abstr))
                {
                    return false;
                }
            }
            if(descr != _r.descr)
            {
                if(descr == null || _r.descr == null || !descr.equals(_r.descr))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::RPCImgRecong::WordWiki");
        __h = IceInternal.HashUtil.hashAdd(__h, key);
        __h = IceInternal.HashUtil.hashAdd(__h, abstr);
        __h = IceInternal.HashUtil.hashAdd(__h, descr);
        return __h;
    }

    public WordWiki
    clone()
    {
        WordWiki c = null;
        try
        {
            c = (WordWiki)super.clone();
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
        __os.writeString(key);
        __os.writeString(abstr);
        __os.writeString(descr);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        key = __is.readString();
        abstr = __is.readString();
        descr = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, WordWiki __v)
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

    static public WordWiki
    __read(IceInternal.BasicStream __is, WordWiki __v)
    {
        if(__v == null)
        {
             __v = new WordWiki();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final WordWiki __nullMarshalValue = new WordWiki();

    public static final long serialVersionUID = -546060532L;
}
