package com.neven.java.basic.clone.deep;

import java.io.IOException;
import java.io.OptionalDataException;
import java.util.logging.Logger;

import com.neven.java.basic.clone.Professor;

public class TestSerializableClone {

	static Logger logger = Logger.getLogger("WhatObjectCanCloneTest");

	public static void main(String[] args) throws OptionalDataException, ClassNotFoundException, IOException {
		Professor t=new Professor("tangliang",30);
		StudentSerializable s1=new StudentSerializable("zhangsan",18,t);
		StudentSerializable s2=(StudentSerializable)s1.deepClone();
		s2.p.name="tony";
		s2.p.age=40;
		System.out.println("name="+s1.p.name+","+"age="+s1.p.age);//学生1的老师不改变

	}

}
