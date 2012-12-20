package com.neven.java.pattern.proxy;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		Dog dog = new DogImpl();
		dog = (Dog) ProxyFactory.swap(dog);
		dog.info();
		dog.run();

	}
}
