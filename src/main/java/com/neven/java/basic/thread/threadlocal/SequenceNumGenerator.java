package com.neven.java.basic.thread.threadlocal;

public class SequenceNumGenerator extends Thread{
	
	public SequenceNumGenerator(String name){
		super(name);
	}
	
	ThreadLocal<Integer> seqenceNum = new ThreadLocal<Integer>(){
		protected Integer initialValue(){
			return 0;
		}
	};
	
	private Integer getNext(){
		Integer nextInt = seqenceNum.get() + 1;
		seqenceNum.set(nextInt);
		return nextInt;
	}
	public void run(){
		for(int i = 0; i<20; i++){
			System.out.println(Thread.currentThread().getName() + " genarate: [" +this.getNext()+"]");
		}
	}
}
