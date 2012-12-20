package com.neven.java.basic.thread.syn;

class MyThread implements java.lang.Runnable {
	private int threadId;

	public MyThread(int id) {
		this.threadId = id;
	}

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println("Thread ID：" + this.threadId + " ： " + i);
		}
	}
}

public class SynFail {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 3; ++i) {
			new Thread(new MyThread(i)).start();
			Thread.sleep(1);
		}
	}
}