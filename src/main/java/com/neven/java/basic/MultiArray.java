package com.neven.java.basic;

public class MultiArray {

	public static void main(String[] args){
		String[][] mArray = new String[2][3];
		mArray[0][0]="a";
		mArray[0][1]="b";
		mArray[0][2]="c";
		mArray[1][0]="aa";
		mArray[1][1]="bb";
		mArray[1][2]="cc";
		String[] arra ={"11","22","33"};
		mArray[0] = arra;
		System.out.println(mArray[0]);
		System.out.println(arra);
	}
}
