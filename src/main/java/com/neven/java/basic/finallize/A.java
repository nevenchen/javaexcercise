package com.neven.java.basic.finallize;


public class A {
	
	protected void finalize() throws Throwable {
		System.out.println("a have die.");
		super.finalize();
		B.a = this;
	}
	
	public void saySomething(){
		System.out.println("I am still alive.");
	}
	
}
