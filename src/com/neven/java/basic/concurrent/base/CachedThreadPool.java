package com.neven.java.basic.concurrent.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++)
			exec.execute(new LiftOff("Thread" + i));
		exec.shutdown();// ��������ֹ�̵߳����У����ǽ�ֹ�����Executor������µ�����
	}
}
