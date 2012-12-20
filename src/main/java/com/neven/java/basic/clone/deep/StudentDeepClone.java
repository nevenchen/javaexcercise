package com.neven.java.basic.clone.deep;

import com.neven.java.basic.clone.Professor;

public class StudentDeepClone  implements Cloneable{
	String name;
	public int age;
	public Professor p;

	StudentDeepClone(String name, int age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

	@Override
	public Object clone() {
		StudentDeepClone o = null;
		try {
			o = (StudentDeepClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		o.p = (Professor) p.clone();
		return o;
	}
}
