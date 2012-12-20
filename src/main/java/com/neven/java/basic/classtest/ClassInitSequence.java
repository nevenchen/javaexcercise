package com.neven.java.basic.classtest;

public class ClassInitSequence extends SuperClass{

	private int a;
	static private int b;
	{
		System.out.println("Sub Non static block Start:");
		System.out.println("Sub.a: "+a);
		System.out.println("Sub.b: "+b);
		System.out.println("Sub Non static block End.\n");
	}
	static {
		System.out.println("Sub Static block Start:");
		System.out.println("Sub.b: "+b);
		System.out.println("Sub Static block End.\n");
	}
	
	public ClassInitSequence(){
		System.out.println("Sub Constructure block Start:");
		System.out.println("Sub.a: "+a);
		System.out.println("Sub.b: "+b);
		System.out.println("Sub Constructure block End.\n");
	}
	public static void main(String[] args){
		new ClassInitSequence();
	}
}

class SuperClass{
	private int a;
	static private int b;
	{
		System.out.println("Super Non static block Start:");
		System.out.println("Super.a: "+a);
		System.out.println("Super.b: "+b);
		System.out.println("Super Non static block End.\n");
	}
	static {
		System.out.println("Super Static block Start:");
		System.out.println("Super.b: "+b);
		System.out.println("Super Static block End.\n");
	}
	
	public SuperClass(){
		System.out.println("Super Constructure block Start:");
		System.out.println("Super.a: "+a);
		System.out.println("Super.b: "+b);
		System.out.println("Super Constructure block End.\n");
	}
	
}
