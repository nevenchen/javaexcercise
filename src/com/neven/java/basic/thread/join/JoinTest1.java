package com.neven.java.basic.thread.join;


public class JoinTest1 {

	/**
	 * @Description:
	 *
	 * @author: Neven Chen
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 * 
	 * 
	 */
	public static void main(String[] args) {
		JoinThread joy = new JoinTest1().new JoinThread("Joy");
		joy.start();
		for(int i=1; i <= 20; i++){
			System.out.println(Thread.currentThread().getName() + "ç¬?+ i + "æ¬¡æ‰§è¡Œã?");
			if(i >2){
				try {
					joy.join();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class JoinThread extends Thread{
		public JoinThread(String name){
			super.setName(name);
		}
		public void run(){
			for(int i = 1; i <= 40; i++){
				System.out.println(Thread.currentThread().getName() + "ç¬?+ i + "æ¬¡æ‰§è¡Œã?");
			}
		}
	}
}
