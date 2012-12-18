package com.neven.java.basic.concurrent.base;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {

		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			results.add(exec.submit(new TaskWithResult(i)));// 这里使用submit
															// 方法会产生Future 对象
		}

		for (Future<String> fs : results) {
			try {
				if (fs.isDone()) {// 检查Future是否已经完成，或者不用isDone()来检查，那么get()将会阻塞，直到结果准备就绪。
					System.out.println(fs.get());// 通过get()得到call()方法返回的值，
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				exec.shutdown();
			}
		}
	}
}

class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	public String call() {
		return "result of TaskWithResult" + id;
	}

}
