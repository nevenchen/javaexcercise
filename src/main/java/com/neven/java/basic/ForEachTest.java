package com.neven.java.basic;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		for (Object s : new ArrayList<String>()) {
			System.out.println(s);
		}

		List<?> temp = null;
		for (Object obj : temp) {
			System.out.println(obj);
		}
	}

}
