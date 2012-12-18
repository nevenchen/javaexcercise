package com.neven.java.basic;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set = new TreeSet();
		Person n1 = new Person("neven","chen");
		Person n2 = new Person("neven","chen");
		set.add(n1);
		set.add(n2);
		System.out.println(set.size());
//		System.out.println(set.contains(n2));

	}

	
}
class Person implements Comparable{
	private String first;
	private String last;
	
	Person(String first, String last){
		this.first=first;
		this.last=last;
	}
	
	public String toString(){
		System.out.println("ToString is called.");
		return this.first+this.last;
	}

	@Override
	public int hashCode(){
		System.out.println("HashCode is called.");
		System.out.println(first.hashCode());
		return first.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("Equls is called.");
		if(o.getClass() == Person.class){
			Person tem = (Person) o;
			return tem.first.equals(this.first) && tem.last.equals(this.last);
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		System.out.println("compareTo is called.");
		if(o.getClass() == Person.class){
			Person tem = (Person) o;
			return (tem.first.equals(this.first) && tem.last.equals(this.last))?0:1;
		}
		return 0;
	}
}