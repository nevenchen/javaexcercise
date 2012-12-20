package com.neven.java.basic.reflect;

public class ReflectTarget implements ReflectTargetI{

	public void method(String[] args){
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
	
	public int method(int a, int b){
		return a + b;
	}
}
