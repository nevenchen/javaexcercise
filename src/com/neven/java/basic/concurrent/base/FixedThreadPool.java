package com.neven.java.basic.concurrent.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	public static void main(String[] args) {
		//Try to set "newFixedThreadPool(1)" it will run like "new SingleThreadPool()"
		ExecutorService exec = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++)
			exec.execute(new LiftOff("Thread" + i));
		exec.shutdown();// ��������ֹ�̵߳����У����ǽ�ֹ�����Executor������µ�����
	}
}
