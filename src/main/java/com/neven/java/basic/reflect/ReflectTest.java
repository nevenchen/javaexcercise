package com.neven.java.basic.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {

	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class clazz = ReflectTarget.class;
		Method methodA = clazz.getMethod("method", new Class[]{int.class,int.class});
		Method methodB = clazz.getMethod("method", new Class[]{String[].class});
		
		Object[] argsA = new Object[]{1,2};
		Object[] argsB = new Object[]{new String[]{"a","b"}};
		
		Object obj = clazz.newInstance();
		Object o = methodA.invoke(obj, argsA);
		methodB.invoke(obj, argsB);
		System.out.println(o.toString());
		
	}
}
