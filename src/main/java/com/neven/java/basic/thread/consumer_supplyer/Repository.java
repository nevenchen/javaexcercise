package com.neven.java.basic.thread.consumer_supplyer;



public class Repository {
	private int amount = 0;
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCapability() {
		return capability;
	}

	public void setCapability(int capability) {
		this.capability = capability;
	}

	private int capability = 50;
	
	public void add(int i){
		this.amount += i;
		System.out.println("生产,仓库产品库存：" + amount);
	}
	
	public void get(int i){
		this.amount -= i;
		System.out.println("消费，仓库产品库存：" + amount);
	}
}
