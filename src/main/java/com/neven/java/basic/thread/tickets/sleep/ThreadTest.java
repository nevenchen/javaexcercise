package com.neven.java.basic.thread.tickets.sleep;

public class ThreadTest implements Runnable {

	private int	tickets	= 10;

	public void run() {
		while (true) {
			synchronized (this) {
				if (tickets > 0) {
					try {
						Thread.sleep(1000);
						System.out.println("I have wake up.");
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println(Thread.currentThread().getName() + "正在买第 " + tickets-- + "号票 ");
				}
				else{break;}
			}
		}
		System.out.println(Thread.currentThread().getName() +"  have stoped");
	}
}
