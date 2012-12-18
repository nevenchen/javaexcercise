package com.neven.java.basic;

import java.io.UnsupportedEncodingException;

import com.ai.core.utils.StringUtils;

public class EncodeTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		System.out.println(StringUtils.AIDecode("%E4%BA%91%E5%92%8C%E7%AB%A5%"));
		System.out.println(new String("%E4%BA%91%E5%92%8C%E7%AB%A5%".getBytes("UTF-8")));
	}

}
