package com.neven.java.basic;

public class SynTest {
	
	public static void main(String[] args) throws InterruptedException{
		A a = new A();
		Thread b = new Thread(a);
		b.start();
		Thread.sleep(100);
		a.a2();
		a.anotify();
	}

}

class A implements Runnable{
	synchronized void a1() throws InterruptedException{
		System.out.println("A1 step1.");
		this.wait();
		System.out.println("A1 step2.");
	}
	void a2(){
		System.out.println("A2 called.");
	}
	@Override
	public void run() {
		try {
			a1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
    
  public synchronized void anotify(){  
      this.notify();  
  }  
	
	
}
