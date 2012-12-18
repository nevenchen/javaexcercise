package com.neven.java.basic.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	private Object target;
	
	public ProxyHandler(Object o){
		this.target = o;
	}
	@Override
	public Object invoke(Object obj, Method method, Object[] args){
		Object ojt = null;
		System.out.println("Before...........");
		try {
			ojt = method.invoke(target, args);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("After...........");
		return ojt;
	}
}
