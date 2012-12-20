package com.neven.java.basic;

public class ObjReffer {
	public static void main(String[] args) 
	{ 
	PassObj objA = new PassObj(); 
	PassObj objB = objA; 

	objB.str = "changed in objB"; 
	System.out.println("Print objA.str value: " + objA.str); 
	} 
}
class PassObj 
{  String str = "init value"; 
} 
