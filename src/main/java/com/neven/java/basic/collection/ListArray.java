package com.neven.java.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListArray {

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
		array2list1();
		array2list2();
		//list2array();
	}
	
	static void array2list2(){
		char[] cde = "cde".toCharArray();
		System.out.print("cde: ");
		System.out.println(cde);
		
		System.out.println("+++++++++++++++++++cde array++++++++++++++++");
		for(char c : cde){
			System.out.println(c);
		}
		List list = Arrays.asList(cde);
		Iterator itr = list.iterator();
		System.out.println("+++++++++++++++++++cde List++++++++++++++++");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("((((((("+list);
	}
	
	static void array2list1(){
		String[] abc = new String[]{"a","b","c"};
		System.out.print("abc: ");
		System.out.println(abc);
		System.out.println("+++++++++++++++++++abc array++++++++++++++++");
		for(String c : abc){
			System.out.println(c);
		}
		List list = Arrays.asList(abc);
		Iterator itr = list.iterator();
		System.out.println("+++++++++++++++++++abc List++++++++++++++++");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("((((((("+list);
	}
	
	static void list2array(){
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		String[] cba = (String[])list.toArray(new String[0]);
		for(String cha : cba){
			System.out.println(cha);
		}
	}
	
}
