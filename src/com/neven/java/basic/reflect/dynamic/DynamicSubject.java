package com.neven.java.basic.reflect.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class DynamicSubject implements InvocationHandler{

	private Object targetSubject;

	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before call: "+method);
		method.invoke(targetSubject, args);
		System.out.println("After call: "+method);
		return null;
	}

	public DynamicSubject(Object targetSubject) {
		super();
		this.targetSubject = targetSubject;
	}
	public DynamicSubject() {
	}

}
