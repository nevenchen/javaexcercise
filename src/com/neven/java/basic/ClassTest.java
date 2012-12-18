package com.neven.java.basic;

public class ClassTest {

	public static void main(String[] args){
		String clazz = ClassTest.class.getName();
		System.out.println(clazz.substring(clazz.lastIndexOf(".")+1));
	}
}
