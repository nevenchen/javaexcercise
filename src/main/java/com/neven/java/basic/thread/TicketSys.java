package com.neven.java.basic.thread;

public class TicketSys {

	public static void main(String[] args) throws InterruptedException {
		Runnable agent = new Agent();
		Thread agentA = new Thread(agent);
		Thread agentB = new Thread(agent);
		Thread agentC = new Thread(agent);
		Thread agentD = new Thread(agent);
		agentA.start();
		agentB.start();
		agentC.start();
		agentD.start();
	}
}

class Agent implements Runnable{

	private  int amount = 100;

	@Override
	public void  run() {
		while (amount > 0) {
			System.out.println(Thread.currentThread().getName() + " sell out the ticket: " + amount);
			amount = amount - 1;
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}