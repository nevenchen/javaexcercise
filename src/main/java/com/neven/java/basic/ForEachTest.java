package com.neven.java.basic;

import java.util.ArrayList;

public class ForEachTest {
	public static void main(String[] args) {
		for (Object s : new ArrayList<String>()) {
			System.out.println(s);
		}
	}

}
