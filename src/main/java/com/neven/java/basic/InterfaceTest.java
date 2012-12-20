package com.neven.java.basic;

public class InterfaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface aa{
	abstract void aMethod();
}
interface b extends aa{}
abstract class d implements aa{}
abstract class e extends d{}
// interface f implements a{}
