package com.neven.java.basic;

import java.util.Arrays;
import java.util.List;


public class ReferValue3 {
	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	static void method1(){
		List<String> ttt = Arrays.asList(new String[]{"aaa","aaa","aaa"});
		for(String temp : ttt){
			temp = temp.replace("a", "b");
		}
		System.out.println(ttt);
	}
	
	static void method2(){
		try{
			String[] ttt =new String[]{"aaa","aaa","aaa"};
			for(int i = 0; i<ttt.length; i++){
				String temp = ttt[i];
				temp.replace("a", "b");
				ttt[i] = temp;
			}
			for(int i = 0; i<ttt.length; i++){
				System.out.println(ttt[i]);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
