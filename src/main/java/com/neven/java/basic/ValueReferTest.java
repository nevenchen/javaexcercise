package com.neven.java.basic;

import org.junit.Test;


public class ValueReferTest {
	
	@Test
	public void referPass1() {
		int a = 9;
		String b = "bbb";
		change(a);
		change(b);
		System.out.println(a);
		System.out.println(b);
	}
	static void change(int x){
		x = x+3;
	}
	static void change(String x){
		x = "aaa";
	}
	
	@Test
	public void referPass2() {
		StringBuffer s= new StringBuffer("good");
	    StringBuffer s2=new StringBuffer("bad");
	    test(s,s2);
	    System.out.println(s);//9
	    System.out.println(s2);//10
	}
	static void test(StringBuffer s,StringBuffer s2) { //此时会在方法栈中新建引用，但指向同一内存地址
	    System.out.println(s);//1
	    System.out.println(s2);//2
	    s2=s;//3
	    s=new StringBuffer("new");//4
	    System.out.println(s);//5
	    System.out.println(s2);//6
	    s.append("hah");//7
	    s2.append("hah");//8
    }

}
