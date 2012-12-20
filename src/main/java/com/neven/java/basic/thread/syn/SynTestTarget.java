package com.neven.java.basic.thread.syn;

public class SynTestTarget {

	public synchronized void methodA() {
		System.out.println("get into method a");
		try {
//			Thread.sleep(3000);
			wait();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("get throw method a");
	}

	public synchronized void methodB() {
		System.out.println("method b excuted");
	}
	
	public void methodC(){
		System.out.println("method c excuted");
	}
}
