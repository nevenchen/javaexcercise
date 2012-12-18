package com.neven.java.basic.clone;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.neven.java.basic.clone.light.StudentLightClone;

public class TestWhatObjectCanClone {

	static Logger logger = Logger.getLogger("WhatObjectCanCloneTest");
	
	public static void main(String[] args){
		Professor profAAA = new Professor("profAAA",60);
		StudentLightClone cloneStd = new StudentLightClone("aaaa",32,profAAA);
		StudentLightClone clonedCloneStd = (StudentLightClone)cloneStd.clone();
		clonedCloneStd.age=34;
		clonedCloneStd.name="cloned aaa";
		logger.info("cloneStd.age: "+cloneStd.age);
		logger.info("cloneStd.name: "+cloneStd.name);
		
		NormalStudent normalStd = new NormalStudent("I am a nomal student",23);
		try{
			normalStd.clone();
		}catch(CloneNotSupportedException e){
			logger.log(Level.WARNING, e.toString());
		}
		
		
	}
}
