package com.neven.java.basic.codepiece;

import java.util.Vector;

public class VectorTest {

	public static void main(String args[]) {
		Vector v = new Vector();
		v.addElement("one");
		System.out.println(v);
		v.addElement("two");
		System.out.println(v);
		v.addElement("three");
		System.out.println(v);
		v.insertElementAt("zero", 0);
		System.out.println(v);
		;
		v.insertElementAt("oop", 3);
		System.out.println(v);
		v.setElementAt("three", 3);
		System.out.println(v);
		v.setElementAt("four", 4);
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}
}
