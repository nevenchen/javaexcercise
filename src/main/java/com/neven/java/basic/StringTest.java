package com.neven.java.basic;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s2==s1.intern());

	}

}
