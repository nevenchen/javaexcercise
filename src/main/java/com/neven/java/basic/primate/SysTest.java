package com.neven.java.basic.primate;

import org.junit.Test;

public class SysTest {

	@Test
	public void test(){
		System.out.println(System.getProperty("file.encoding"));//1.4
		System.out.println(java.nio.charset.Charset.defaultCharset());//1.5
		System.out.println("currentTimeMillis: "+System.currentTimeMillis());
		System.out.println("identityHashCode: "+System.identityHashCode(new Integer(2)));
		System.out.println("lineSeparator: "+System.lineSeparator());
		System.out.println("nanoTime: "+System.nanoTime());
		System.out.println("getenv: "+System.getenv());
		System.out.println("getProperties: "+System.getProperties());
	}
}
