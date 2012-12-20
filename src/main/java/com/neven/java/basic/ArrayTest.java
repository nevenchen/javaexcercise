package com.neven.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args){
		splitTest();
//		stringArray2List();
		nullElement();
	}
	
	public static void nullElement(){
		String[] strs = new String[1];
		strs[0] = null;
		System.out.println(strs[0]);
	}
	public static void splitTest(){
		String[] emptyStrArrays = new String[]{"","",""};
		System.out.println("emptyStrArrays Length: " + emptyStrArrays.length);
		System.out.println("emptyStrArrays to List Length: " + emptyStrArrays.length);
		System.out.println("emptyStrArrays AS String: " + Arrays.toString(emptyStrArrays));
		System.out.println("emptyStrArrays AS List: " + Arrays.asList(emptyStrArrays));
		
		String arg = "aaa";
//		String arg = "aaaB"; //Try to test with this one
		String[] args = arg.split("a");
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.asList(args));
		System.out.println("Array Lenth: "+args.length);
	}
	
	public static void stringArray2List(){
		String[] temps = new String[]{"789","890"};
		System.out.println(Arrays.toString(temps));
		
		List<String> lis = new ArrayList<String>();
		lis.add("asdf");
		lis.add("123");
		lis.add("456");
		
		temps = lis.toArray(new String[0]);
		System.out.println(Arrays.toString(temps));
		
	}
}
