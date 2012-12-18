package com.neven.java.basic;

interface Operation {
	double operateTwoIntNum(int a, int b);
}

public class InnerClassTest {

	/**
	 * 加法
	 */
	public static double add(int a, int b) {
		/**
		 * 匿名内部类实现加法
		 */
		double c = new Operation() {

			@Override
			public double operateTwoIntNum(int a, int b) {

				return a + b;
			}
		}.operateTwoIntNum(a, b);
		return c;
	}

	/**
	 * 减法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double subtract(int a, int b) {
		/**
		 * 匿名内部类实现加法
		 */
		double c = new Operation() {

			@Override
			public double operateTwoIntNum(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		}.operateTwoIntNum(a, b);
		return c;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 3));
		System.out.println(subtract(10, 3));
	}
}