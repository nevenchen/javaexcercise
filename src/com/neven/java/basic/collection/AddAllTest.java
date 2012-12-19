package com.neven.java.basic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;;


public class AddAllTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		Integer[] ayyay1 = {1,2,3};
		list1 = Arrays.asList(ayyay1);
		list2.addAll(list1);
		list2.addAll(list1);
		System.out.println(list2);
		Integer[] arrays = (Integer[])list2.toArray(new Integer[0]);
		System.out.println(arrays);
	}
}
