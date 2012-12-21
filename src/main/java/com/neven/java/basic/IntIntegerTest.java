package com.neven.java.basic;

import org.junit.Test;

public class IntIntegerTest {

	/*
	 * 原因：在java中将int转到Integer时调用的是Integer.valueof(int i)方法进行转换,
	 * 而该方法里使用了缓存，缓存里存储了+127 > value > -128的基本数据
	 */
	@Test
	public void method1() {
		Long longMinus128A = -128L;
		Long longMinus128B = -128L;
		System.out.println("longMinus128A = longMinus128B: "+ (longMinus128A == longMinus128B));
		
		Long longMinus129A = -129L;
		Long longMinus129B = -129L;
		System.out.println("longMinus129A = longMinus129B: "+ (longMinus129A == longMinus129B));

		Integer intMinus128A = -128;
		Integer intMinus128B = -128;
		System.out.println("intMinus128A=intMinus128B:" + (intMinus128A == intMinus128B));

		Integer int128A = 128;
		Integer int128B = 128;
		// 因为128超出了，?会新生成?int常量128；Integer i3 = 128 等价于：Integer i3 = new
		// Integer?28?
		System.out.println("int128A=int128B:" + (int128A == int128B));
		// 此处会对i3进行自动拆箱会调用i3.intValue() == 128
		System.out.println("int128A= 128:" + (int128A == 128));

		Integer integer127A = new Integer(127);
		Integer integer127B = new Integer(127);
		System.out.println(("integer127A=integer127B: ") + (integer127A == integer127B));
	}

	@SuppressWarnings("static-access")
	@Test
	public void method2() {
		Integer a1 = 200;
		Integer a3 = 200;
		System.out.println("a1=a3:" + (a1 == a3));

		Integer a4 = 127;
		Integer a5 = 127;
		System.out.println(a4 == a5);

		int a2 = 200;
		System.out.println(a1.MAX_VALUE);
		System.out.println(a1 == a2);
		System.out.println(a2);

	}

	@SuppressWarnings({"unused" })
	@Test
	public void method3() {
		System.out.println(Integer.MAX_VALUE + 1);
		Long i = 1L;
		long j = 1;
		short h = 200;
		h += 1;
		System.out.println(h);
	}

	/**
	 * @Description:自动装，拆箱中的陷阱
	 * 
	 * @author: Neven Chen
	 * @param
	 * @return void
	 * 
	 * @Exception:
	 */
	@SuppressWarnings({ "unused", "null" })
	@Test
	public void method4() {
		/*
		 * 这样的语法在编译时期是合法的，但是在运行时期会有错误，因为这种写法相当于? Integer i = null;int j =
		 * i.intValue();null表示i没有参?至任何的对象实体?
		 * 它可以合法地指定给对象参考名称?由于实际上i并没有参考至任何的对象，?也就不可能操作intValue()方法?
		 * 这样上面的写法在运行时会出现NullPointerException错误?
		 */
		Integer i = null;
		int j = i;
	}

	@Test
	public void method5() {
		Integer i = 2147483647;
		Long m = 2147483648L;
		System.out.println(m > i);
	}
}
