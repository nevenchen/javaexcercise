package com.neven.java.basic.classtest;

public class ClassTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args){
		A1 a2 = new A2();
		A2 a3 = new A2();
		A1 a1 = new A1(5);                    
		// 静态方法不具有多态效果，它是根据引用声明类型来调用
		a1.f();// A1.f()
		a2.f();// A1.f()
		a3.f();
		a1.printSize();

	}
}
class A1 {
	private final int size;
	public A1(int size){
		System.out.println("Before initial: "+this.size);
		System.out.println("size pass to me: "+size);
		this.size = size;
	}
	public static void f() {
		System.out.println("A1.f()");
	}
	public void printSize(){
		System.out.println(this.size);
	}
}
class A2 extends A1 {
	public A2(){
		super(6);
	}
	public static void f() {
		System.out.println("A2.f()");
	}
}
