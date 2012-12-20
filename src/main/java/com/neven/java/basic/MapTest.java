package com.neven.java.basic;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args){
		Map mm = new HashMap();
		mm.put("a","a");
		mm.put("a", "b");
		System.out.println(mm);
	}
}
