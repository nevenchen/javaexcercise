package com.neven.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args){
//		splitTest();
		stringArray2List();
	}
	
	public static void nullElement(){
		String[] strs = new String[1];
		strs[0] = null;
		System.out.println(strs[0]);
	}
	public static void splitTest(){
		String arg = "a;;;;;";
		String[] args = arg.split(";");
		System.out.println(Arrays.asList(args));
		System.out.println(Arrays.asList(arg).size());
		
		String to = "";

		for (String email : args) {
			to += email + ";";
		}
		System.out.println(to);;
	}
	
	public static void stringArray2List(){
		String[] temps = new String[]{"789","890"};
		List<String> lis = new ArrayList<String>();
		lis.add("asdf");
		lis.add("123");
		lis.add("456");
		
		temps = lis.toArray(new String[0]);
		for(String tem : temps){
			System.out.println(tem);
		}
		
	}
}
