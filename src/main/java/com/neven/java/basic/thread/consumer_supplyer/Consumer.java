package com.neven.java.basic.thread.consumer_supplyer;


public class Consumer extends Thread{
	Repository store ;
	public Consumer(Repository store){
		this.store = store;
	}
	public void run(){
		for(int i = 1; i <= 100; i++){
			if(store.getAmount()<store.getCapability()){
			try {
				synchronized(this){
					System.out.println("consumer is going to waiting.");
					this.wait();
				}
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else
			store.get(1);
		}
	}
}
