package com.neven.java.basic;


public class ReferValueTest1 {
	
	public static void main(String[] args) {
//		int a = 9;
//		String b = "bbb";
//		change(a);
//		change(b);
//		System.out.println(a);
//		System.out.println(b);
		integer();
	}
	static void change(int x){
		x = x+3;
	}
	static void change(String x){
		x = "aaa";
	}
	static void integer(){
		Integer int1 = 128;
		Integer int2 = int1;
		int2 = 129;
		System.out.println(int1);
	}
}
