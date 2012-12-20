package com.neven.java.basic.clone.light;

import com.neven.java.basic.clone.Professor;

public class StudentLightClone  implements Cloneable{
	public String name;
	public int age;
	public Professor p;

	public StudentLightClone(String name, int age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

	@Override
	public Object clone() {
		StudentLightClone o = null;
		try {
			o = (StudentLightClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		return o;
	}
}
