package com.neven.java.basic;

public class LightClone {

	public static void main(String[] args) {
		MyClone myClone1 = new MyClone("clone1");
		myClone1.rc.refer = "AAAAAAAAAAAAA";

		MyClone myClone2 = (MyClone) myClone1.clone();
		myClone2.rc.refer = "BBBBBBBBBBBB";

		if (myClone2 != null) {
			System.out.println(myClone2.getName());
			System.out.println("myClone2 equals myClone1: "
					+ myClone2.equals(myClone1));
			System.out.println(myClone1.rc.refer);
		} else {
			System.out.println("Clone Not Supported");
		}
	}
}

class ReferClass {
	public String refer;
}

class MyClone implements Cloneable {
	private String name;
	public ReferClass rc;

	public MyClone(String name) {
		this.name = name;
		rc = new ReferClass();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}