package com.neven.java.basic.thread.prod_consum;

public class Producer implements Runnable {

	private Store store;

	public Producer(Store st) {
		store = st;
	}

	@Override
	public void run() {
		
			if (store.storeGoods > 100) {
				System.out.println("Store is full. ++++++++++++");
				try {
					synchronized (store) {
					store.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			while (store.storeGoods < 100) {
				synchronized (store) {
				store.storeGoods = store.storeGoods + 1;
				System.out.println("++++++ Producer generate one product: "+store.storeGoods+". ++++");
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
