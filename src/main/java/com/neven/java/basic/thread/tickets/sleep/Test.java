package com.neven.java.basic.thread.tickets.sleep;


public class Test {
	
	class MyThread implements Runnable{
		private int count = 1;
		public void run() {
			while(this.count<=10){
				synchronized(this){
					System.out.println(Thread.currentThread().getName() + "第"+ count++ +"次打印ABC"); 
				}
			}
		}
	}
	public static void main(String[] args){
		Test test = new Test();
		MyThread t = test.new MyThread();
		new Thread(t,"Thread1").start();
		new Thread(t,"Thread2").start();
		new Thread(t,"Thread3").start();
	}
	
}
