package com.neven.java.basic.clone;

import com.neven.java.basic.clone.light.StudentLightClone;

public class NormalStudent {
	public String name;
	public int age;

	NormalStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Object clone() throws CloneNotSupportedException {
		StudentLightClone o = null;
		o = (StudentLightClone) super.clone();
		return o;
	}
}
