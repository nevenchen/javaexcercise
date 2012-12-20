package com.neven.java.basic.collection;


public class Client {
	public static void main(String[] args) {    
	     Person[] person = new Person[] {    
	         new Person("ouyang", "feng", Boolean.TRUE, new Integer(27)),    
	         new Person("zhuang", "gw", Boolean.TRUE, new Integer(27)),    
	         new Person("zhuang", "gw", Boolean.FALSE, new Integer(27)),    
	         new Person("zhuang", "gw", Boolean.FALSE, new Integer(2)),    
	      };    
	     for (int i = 0; i < person.length; i++) {    
	        System.out.println("before sort=" + person[i]);    
	      }    
	      java.util.Arrays.sort(person, Comparators.getComparator());    
	   
	     for (int i = 0; i < person.length; i++) {    
	         System.out.println("after sort=" + person[i]);    
	      }    
	   
	   
	}    

}
