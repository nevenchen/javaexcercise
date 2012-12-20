package com.neven.java.basic.concurrent.base;


public class NoPool {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Thread(new LiftOff("Thread" + i)).start();
	}
}
