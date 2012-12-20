package com.neven.java.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	
	public static Object swap(Object object) throws Exception {
		
		DaoHandler handler = new ProxyFactory().new DaoHandler(object);
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object
				.getClass().getInterfaces(), handler);
	}

	private class DaoHandler implements InvocationHandler {

		private Object target;

		public DaoHandler(Object obj) throws Exception {
			String targetBeanName = getTargetBeanName(obj);
			target = Class.forName(targetBeanName).newInstance();

		}
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			return method.invoke(target, args);
		}

		private String getTargetBeanName(Object obj) {
			String clazz = obj.getClass().getName();
			clazz = clazz + "Plus";
			return clazz;
		}
	}
}
