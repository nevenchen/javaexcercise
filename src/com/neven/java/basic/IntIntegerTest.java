package com.neven.java.basic;

public class IntIntegerTest {

	public static void main(String[] args) {
//		method1(); 
//		method2(); 
//		method3(); 
//		method4(); 
		method5(); 
	}

	/*
	 * 原因：在java中将int转到Integer时调用的是Integer.valueof(int i)方法进行转换, 
	 * 而该方法里使用了缓存，缓存里存储了value�?128�?27的基本数据�?当参数�?在该范围时，返回缓存对象�?
	 */
	static void method1() {
		Long i1 = -128L;
		Long i2 = -128L;
		System.out.println(i1 == i2);
		
		Integer i11 = -128;
		Integer i21 = -128;
		System.out.println("i11=i12:"+(i11 == i21));
		
		Integer i3 = 128;
		Integer i4 = 128;
		//因为128超出了，�?��会新生成�?��int常量128；Integer i3 = 128 等价于：Integer i3 = new Integer�?28�?
		System.out.println("i3=i4:"+(i3 == i4));
		//此处会对i3进行自动拆箱会调用i3.intValue() == 128
		System.out.println(i3 == 128);
		
		Integer i5 = new Integer(128);
		System.out.println(("i3=i5:")+(i3 == i5));
		System.out.println(i5==128);
		
		Integer i6 = new Integer(127);
		Integer i7 = new Integer(127);
		System.out.println(("i6=i7:")+(i6 == i7));
		
		Long l1 = -2147483649L;
		Long l2 = -2147483648L;
		System.out.println(l1);
		System.out.println(l1 == l2);
	}
	
	static void method2(){
		Integer a1 = 200;
		Integer a3 = 200;
		System.out.println("a1=a3:"+(a1 == a3));
		
		Integer a4 = 127;
		Integer a5 = 127;
		System.out.println(a4 == a5);
		
		int a2 = 200;
		System.out.println(a1.MAX_VALUE);
		System.out.println(a1 == a2);
		System.out.println(a2);
		
		
	}
	
	static void method3(){
		System.out.println(Integer.MAX_VALUE+1);
		Long i = 1L;
		long j = 1;
		short h = 200;
		h+=1;
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
	static void method4(){
		/*
		 * 这样的语法在编译时期是合法的，但是在运行时期会有错误，因为这种写法相当于�?
			Integer i = null;int j = i.intValue();null表示i没有参�?至任何的对象实体�?
			它可以合法地指定给对象参考名称�?由于实际上i并没有参考至任何的对象，�?��也就不可能操作intValue()方法�?
			这样上面的写法在运行时会出现NullPointerException错误�?
		 */
		Integer i = null;
		int j = i;
	}
	
	static void method5(){
		Integer i = 2147483647;
		Long    m = 2147483648L;
		System.out.println(m>i);
	}
}
