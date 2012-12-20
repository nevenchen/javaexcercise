package com.neven.java.basic.thread.prod_consum;

public class Client {

	public static void main(String[] args) {
		Store st = new Store();
		for(int i =0; i<30; i++){
			Thread prod = new Thread(new Producer(st));
			prod.setPriority(1);
			Thread consum = new Thread(new Consumer(st));
			consum.setPriority(10);
			
			prod.start();
			consum.start();
		}
	}

}
