package com.neven.java.basic.thread.prod_consum;

public class HambSys {
	public static void main(String[] args) {
		Hmaker maker = new Hmaker();
		Hassistant assistant = new Hassistant();
		maker.setName("甲");
		maker.start();
		assistant.start();
	}
}

class Hassistant extends Thread {
	public void sell() {
		synchronized (Ham.box) {
			if (Ham.production == 0) {
				System.out.println("营业员：顾客朋友们，请稍微等一下，汉堡没了！！");
			}
			try {
				Ham.box.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Ham.sales++;
			System.out.println("营业员：顾客好，汉堡上来了，（总共卖了:" + Ham.sales + "个）");
		}
	}

	public void run() {
		while (Ham.sales < Ham.production) {
			// 1秒卖一个
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sell();
		}
	}
}

class Hmaker extends Thread {
	public void make() {
		synchronized (Ham.box) {
			(Ham.production)++;
			Ham.box.notify();
		}
	}

	public void run() {
		while (Ham.production <= Ham.totalmaterial) {
			if (Ham.production > 0) {
				System.out.println("厨师" + getName() + ":" + "汉堡来了（总共"
						+ (Ham.production - Ham.sales) + "个）");
			}
			// 3秒做一个
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			make();
		}
	}
}

class Ham {
	static Object box = new Object();
	static int totalmaterial = 10;
	static int sales = 0;
	static int production = 5;
}