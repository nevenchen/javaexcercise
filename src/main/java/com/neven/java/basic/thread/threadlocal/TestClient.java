package com.neven.java.basic.thread.threadlocal;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SequenceNumGenerator sqGtA = new SequenceNumGenerator("A");
		SequenceNumGenerator sqGtB = new SequenceNumGenerator("B");
		SequenceNumGenerator sqGtC = new SequenceNumGenerator("C");
		sqGtA.start();
		sqGtB.start();
		sqGtC.start();
	}

}
