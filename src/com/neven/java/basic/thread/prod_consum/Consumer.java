package com.neven.java.basic.thread.prod_consum;

public class Consumer implements Runnable {
	private Store store;

	public Consumer(Store st) {
		store = st;
	}

	@Override
	public void run() {
			if (store.storeGoods == 0) {
				System.out.println("Store is empty --------------.");
				try {
					synchronized (store) {
						store.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while (store.storeGoods > 0) {
				synchronized (store) {
				store.storeGoods = store.storeGoods - 1;
				System.out.println("------ Consumer destroy one product: "+store.storeGoods+". -----");
				store.notify();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
