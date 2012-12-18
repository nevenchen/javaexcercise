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
			results.add(exec.submit(new TaskWithResult(i)));// ����ʹ��submit
															// ���������Future ����
		}

		for (Future<String> fs : results) {
			try {
				if (fs.isDone()) {// ���Future�Ƿ��Ѿ���ɣ����߲���isDone()����飬��ôget()����������ֱ�����׼��������
					System.out.println(fs.get());// ͨ��get()�õ�call()�������ص�ֵ��
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
