package com.neven.java.basic.thread.syn;

class MyThread2 implements java.lang.Runnable{

	private int threadId;
	private Object lock;

	public MyThread2(int id, Object obj){
		this.threadId = id;
		this.lock = obj;
	}

	@Override
	public void run(){
		synchronized (lock){
			for (int i = 0; i < 100; ++i){
				System.out.println("Thread ID： " + this.threadId + " ： " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class SynObject{
	public static void main(String[] args) throws InterruptedException{
		Object obj = new Object();
		for (int i = 0; i < 10; ++i){
			new Thread(new MyThread2(i, obj)).start();
			Thread.sleep(1);
		}
	}
}
