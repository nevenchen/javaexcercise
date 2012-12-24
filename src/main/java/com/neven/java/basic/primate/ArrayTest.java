package com.neven.java.basic.primate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayTest {
	
	@Test 
	public void twoDimensionalArray(){
		String[][] mArray = new String[2][3];
		mArray[0][0]="a";
		mArray[0][1]="b";
		mArray[0][2]="c";
		mArray[1][0]="aa";
		mArray[1][1]="bb";
		mArray[1][2]="cc";
		String[] arra ={"11","22","33"};
		mArray[0] = arra;
		System.out.println(Arrays.toString(mArray[0]));
		System.out.println(Arrays.toString(mArray[1]));
		System.out.println(Arrays.toString(arra));
	}

	@Test
	public void array2list(){
		String[] temps = new String[]{"789","890"};
		System.out.println(Arrays.toString(temps));
		
		List<String> lis = new ArrayList<String>();
		lis.add("asdf");
		lis.add("123");
		lis.add("456");
		
		temps = lis.toArray(new String[0]);
		System.out.println(Arrays.toString(temps));
	}
}
