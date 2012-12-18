package com.neven.java.basic.clone.deep;

import java.util.logging.Logger;

import com.neven.java.basic.clone.Professor;

public class TestDeepClone {

	static Logger logger = Logger.getLogger("WhatObjectCanCloneTest");

	public static void main(String[] args) {
		Professor profAAA = new Professor("profAAA", 60);
		StudentDeepClone originalStd = new StudentDeepClone("aaaa", 32, profAAA);
		StudentDeepClone clonedStd = (StudentDeepClone) originalStd.clone();
		clonedStd.p.name="profBBB";
		System.out.println("_____________________________");
		System.out.println("clonedStd.p.age: " + clonedStd.p.age);
		System.out.println("clonedStd.p.name: " + clonedStd.p.name);
		System.out.println("_____________________________");
		System.out.println("originalStd.p.age: " + originalStd.p.age);
		System.out.println("originalStd.p.name: " + originalStd.p.name);
		System.out.println("_____________________________");
		System.out.println("The referd Object will not reflect each other.");

	}

}
