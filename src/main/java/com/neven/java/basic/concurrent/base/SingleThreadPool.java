package com.neven.java.basic.concurrent.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++)
			exec.execute(new LiftOff("Thread" + i));
		exec.shutdown();// 并不是终止线程的运行，而是禁止在这个Executor中添加新的任务
	}
}
