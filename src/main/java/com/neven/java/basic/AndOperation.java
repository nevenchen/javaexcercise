package com.neven.java.basic;

import java.util.Arrays;


public class AndOperation {

	@SuppressWarnings("unused")
	public static void main(String[] args){
		final String[] s = new String[1];
		if(true | (s[0] = "s") == "a"){
			System.out.println("Here &");
		}
		System.out.println("&" + Arrays.toString(s));
		
		final String[] b = new String[1];
		if(true || (b[0] = "s") == "a"){
			System.out.println("Here &&");
		}
		System.out.println("&" + Arrays.toString(b));
	}
}
