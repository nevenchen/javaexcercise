package com.neven.java.basic.reflect.dynamic;

import java.lang.reflect.Method;

public class InvokeTester {

	public int add(int param1, int param2) {
		return param1 + param2;
	}

	public String echo(String mesg) {
		return "echo" + mesg;
	}

	public static void main(String[] args) throws Exception {
		Class classType = InvokeTester.class;
		Object invokertester = classType.newInstance(); // 下面介绍与new 的区�?
		Method addMethod = classType.getMethod("add", new Class[] { int.class, int.class });
		// Method类的invoke(Object obj,Object args[])方法接收的参数必须为对象�?
		// 如果参数为基本类型数据，必须转换为相应的包装类型的对象�?invoke()方法的返回�?总是对象�?
		// 如果实际被调用的方法的返回类型是基本类型数据，那么invoke()方法会把它转换为相应的包装类型的对象�?
		// 再将其返�?
		Object result = addMethod.invoke(invokertester, new Object[] { new Integer(100), new Integer(200) });
		// 在jdk5.0中有了装�?拆箱机制 new Integer(100)可以�?00来代替，系统会自动在int 和integer之间转换
		System.out.println(result);
		Method echoMethod = classType.getMethod("echo", new Class[] { String.class });
		result = echoMethod.invoke(invokertester, new Object[] { " hello" });
		System.out.println(result);
	}
	/*
	 * newInstance()方法和new关键字除了一个是方法，一个是关键字外，最主要有什么区别？它们的区别在于创建对象的方式不一样，
	 * 前�?是使用类加载机制，后者是创建�?��新类。那么为�?��会有两种创建对象方式？这主要考虑到软件的可伸缩�?可扩展和可重用等
	 * 软件设计思想�?我们使用关键字new创建�?��类的时�?，这个类可以没有被加载�?但是使用newInstance()方法的时候，就必须保
	 * 证：1、这个类已经加载�?、这个类已经连接了�?
	 * newInstance()实际上是把new这个方式分解为两步，即首先调用Class加载方法加载某个类，然后实例化�? 
	 * 这样分步的好处是显�?易见的�?我们可以在调用class的静态加载方法forName时获得更好的灵活性，提供给了�?��降�?的手段�? 

		�?��用最�?��的描述来区分new关键字和newInstance()方法的区别： 
		newInstance: 弱类型�?低效率�?只能调用无参构�?�?
		new: 强类型�?相对高效。能调用任何public构�?�?
	 */
}
