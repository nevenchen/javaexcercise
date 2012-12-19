package com.neven.java.basic.jndi;

import java.util.Hashtable;

import javax.naming.*;
import javax.naming.spi.*;

public class BindedClassFactory implements ObjectFactory
   {
    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx,
            Hashtable<?, ?> environment) throws Exception
       {
        if(obj instanceof Reference)
           {
            Reference ref = (Reference)obj;
            String val = (String)ref.get("value").getContent();
            BindedClass o = new BindedClass();
            o.setValue(val);
            return o;
            
        }
        return null;
    }
}
