package com.neven.java.basic.classtest;


public class LazyInitUpdate {
	private static boolean initial = false;
	static Thread t = new Thread(new Runnable() {
		public void run() {
			System.out.println("befor...");//此句会输�?
			/*
			 * 由于使用Lazy.initial静�?成员，又因为Lazy还未 �?
			 * 始化完成，所以该线程会在这里等待主线程初始化完成
			 */
			initial = true;
			System.out.println("after...");//此句不会输出
		}
	});
	static {
		t.start();
	}

	public static void main(String[] args) {

		try {
			t.join();// 主线程等待t线程结束
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(initial);
	}
}
