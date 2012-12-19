package com.neven.java.basic.jndi;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

public class BindedClass implements Referenceable
   {
    public String value; 
    
    public BindedClass()
       {
    }
    
    @Override
    public Reference getReference() throws NamingException
       {
        Reference r = new Reference(this.getClass().getName(), BindedClassFactory.class.getName(), null);
        r.add(new StringRefAddr("value", this.getValue()));
        return r;
    }

    public String getValue()
       {
        return value;
    }

    public void setValue(String value)
       {
        this.value = value;
    }

}
