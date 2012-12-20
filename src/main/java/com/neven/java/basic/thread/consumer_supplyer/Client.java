package com.neven.java.basic.thread.consumer_supplyer;

public class Client {

	public static void main(String[] args) {
		Repository store = new Repository();
		Provider provider = new Provider(store);
		provider.setName("provider");
		Consumer consumer = new Consumer(store);
		consumer.setName("consumer");
		provider.start();
		consumer.start();
		do {
			try {
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (store.getAmount() < 0) {
				if (provider.getState().equals(Thread.State.WAITING)) {
					synchronized(provider){
						provider.notify();
					};
				}
			}
			else {
				if (consumer.getState().equals(Thread.State.WAITING)) {
					synchronized(consumer){
						consumer.notify();
					};
				}
			}
		}
		while (true);
	}
}
