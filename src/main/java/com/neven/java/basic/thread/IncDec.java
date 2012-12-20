package com.neven.java.basic.thread;

public class IncDec {

	public static void main(String[] args){
		 Operator  o = new Operator();
			Thread inc = new Thread(new IncThread(o));
			Thread dec = new Thread(new DecThread(o));
			inc.start();
			dec.start();
	}
}

class IncThread implements Runnable{
	private Operator o;
	public IncThread(Operator o){
		this.o = o;
	}

	@Override
	public void run() {
		synchronized(o){
			o.inc();
		}
	}
}

class DecThread implements Runnable{
	private Operator o;
	public DecThread(Operator o){
		this.o = o;
	}

	@Override
	public void run() {
		synchronized(o){
			o.dec();
		}
	}
}

class Operator{
	private int num = 100;
	
	protected void inc(){
		while(num < 200){
			num = num +1;
			System.out.println("******** Increase operation num = " + num);
		}
	}
	protected void dec(){
		while(num > 0){
			num = num -1;
			System.out.println("&&&&&&&& Decrease operation num = " + num);
		}
	}
}
