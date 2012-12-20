package com.neven.java.basic;


public class StringTest1 {

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
		String s1 = new String("abc");
		String s2 = "abc";
		s1.intern();
		System.out.println(s1==s2);
	}
}
