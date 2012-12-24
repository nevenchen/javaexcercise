package com.neven.java.basic.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set = new TreeSet();
		People n1 = new People("neven","chen");
		People n2 = new People("neven","chen");
		set.add(n1);
		set.add(n2);
		System.out.println(set.size());
//		System.out.println(set.contains(n2));

	}

	
}
class People implements Comparable{
	private String first;
	private String last;
	
	People(String first, String last){
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
		if(o.getClass() == People.class){
			People tem = (People) o;
			return tem.first.equals(this.first) && tem.last.equals(this.last);
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		System.out.println("compareTo is called.");
		if(o.getClass() == People.class){
			People tem = (People) o;
			return (tem.first.equals(this.first) && tem.last.equals(this.last))?0:1;
		}
		return 0;
	}
}