package com.neven.java.basic.thread.notify;

import java.util.List;

public class Product implements Runnable {

	private List	container	= null;
	private int		count;

	public Product(List lst) {
		this.container = lst;
	}

	public void run() {
		while (true) {
			synchronized (container) {
				if (container.size() > MultiThread.MAX) {
					try {
						container.wait();
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				container.add(new Object());
				container.notify();
				System.out.println("我生产了" + (++count) + "个");
			}
		}
	}
}
