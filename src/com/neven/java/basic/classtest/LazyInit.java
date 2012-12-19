package com.neven.java.basic.classtest;


/**
 * @Class�?
 * @Description:当一个线程访问一个类的某个成员的时�?，它会去�?��这个类是否已经被初始化，在这�?��程中会有以下四种情况�?
1�?这个类尚未被初始�?
2�?这个类正在被当前线程初始化：这是对初始化的�?归请求，会直接忽略掉（另，请参�?《构造器中静态常量的引用问题》一节）
3�?这个类正在被其他线程而不是当前线程初始化：需等待其他线程初始化完成再使用类的Class对象，�?不会两个线程都会去初始化�?��（如果这样，那不类会初始化两遍，这显示不合理�?
4�?这个类已经被初始�?

 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 17:15:32
 * Revision history:
 *
 * @see 	 
 */
public class LazyInit {
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

		try {
			t.join();// 主线程等待t线程结束
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(initial);
	}
}
