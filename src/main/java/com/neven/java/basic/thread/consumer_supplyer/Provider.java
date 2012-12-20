package com.neven.java.basic.thread.consumer_supplyer;


public class Provider extends Thread{
	Repository store ;
	public Provider(Repository store){
		this.store = store;
	}
	public void run(){
		for(int i = 1; i <= 10000; i++){
			if(store.getAmount()>store.getCapability()){
				try {
					synchronized(this){
						System.out.println("provider is going to waiting.");
						wait();
					}
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else
			store.add(1);
		}
	}
}
