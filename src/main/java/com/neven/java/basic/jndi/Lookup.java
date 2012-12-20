package com.neven.java.basic.jndi;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class Lookup
   {
    public static void main(String[] args) throws Exception
       {
        Properties ps = new Properties();
        ps.setProperty(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        ps.setProperty(Context.PROVIDER_URL, "file:H:/temp");
        DirContext ctx = new InitialDirContext(ps);
        String key = "bind1";
        BindedClass o = (BindedClass)ctx.lookup(key);
        System.out.println(o.getValue());    
        
        ctx.close();
    }

}
