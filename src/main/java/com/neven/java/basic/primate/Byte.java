package com.neven.java.basic.primate;

import org.junit.Test;

public class Byte {
	@Test
	public void bytes2HexString() {
		byte[] b = new byte[]{2,-98};
		String ret = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			ret += hex.toUpperCase();
		}
		System.out.println(ret);
	}
}
