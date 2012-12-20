package com.neven.java.basic.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ReflectProxyTest {

	public static void main(String args[]) {

		ReflectTargetI target = new ReflectTarget();
		InvocationHandler handler =	new ProxyHandler(target);
		ReflectTargetI proxyObj = (ReflectTargetI)Proxy.newProxyInstance(ReflectTarget.class.getClassLoader(),ReflectTarget.class.getInterfaces(),handler);
	
		proxyObj.method(new String[]{"a","b"});
		System.out.println(proxyObj.method(1,2));
	}
}
