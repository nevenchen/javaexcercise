package com.neven.java.basic.thread.syn;


public class SynTest {

	/**
	 * @Description:
	 *
	 * @author name: Neven
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		final SynTestTarget target = new SynTestTarget();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				target.methodA();
				target.methodB();
				target.methodC();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				target.methodC();
				target.methodB();
			}
		});
		t1.start();
		t2.start();
	}
	
	
}
