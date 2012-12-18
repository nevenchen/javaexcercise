package com.neven.java.basic.concurrent.base;

public class LiftOff implements Runnable {
	protected int countDown = 10; // Default
	private static int taskCount = 0;
	private final int id = taskCount++;
	private String threadName;

	public LiftOff(String name) {
		this.threadName = name;
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return threadName + ": #" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ")\n";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}

	}
}