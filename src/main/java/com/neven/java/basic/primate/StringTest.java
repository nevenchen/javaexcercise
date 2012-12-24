package com.neven.java.basic.primate;

import java.util.Arrays;

import org.junit.Test;

public class StringTest {


	@Test
	public void internTest() {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s2==s1);
		System.out.println(s2==s1.intern());
	}

	@Test
	public void splitTest(){
		String[] emptyStrArrays = new String[]{"","",""};
		System.out.println("emptyStrArrays Length: " + emptyStrArrays.length);
		System.out.println("emptyStrArrays to List Length: " + emptyStrArrays.length);
		System.out.println("emptyStrArrays AS String: " + Arrays.toString(emptyStrArrays));
		System.out.println("emptyStrArrays AS List: " + Arrays.asList(emptyStrArrays));
		
		String arg = "aaa";
//		String arg = "aaaB"; //Try to test with this one
		String[] args = arg.split("a");
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.asList(args));
		System.out.println("Array Lenth: "+args.length);
	}
}
