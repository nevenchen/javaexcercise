package com.neven.java.basic.reflect.dynamic;


public class RealSubject implements CommenSubject{

	/* (non-Javadoc)
	 * @see dynamicproxy.CommenSubject#doBusiness()
	 */
	public void doBusiness(int[] args) {
		System.out.println("This is the response from real subject.");
		System.out.println("args: .");
		for(int i : args){
			System.out.println(i);
		}
		System.out.println("+++++++++++++++");
	}
}
