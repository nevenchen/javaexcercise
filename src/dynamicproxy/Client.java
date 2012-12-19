package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;


public class Client {

	/**
	 * @Description:
	 *
	 * @author name: neven
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		InvocationHandler invocation = new DynamicSubject(realSubject);
		Class<?> clazz = realSubject.getClass();
		CommenSubject subject = (CommenSubject)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), invocation);
		subject.doBusiness(new int[]{3,4,6});

	}
}
