package com.neven.java.basic;

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String buffer = new String("aaaaabb");
		buffer = buffer.replace("bb", "aa");
		System.out.println(buffer);

	}

}
