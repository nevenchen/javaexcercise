package com.neven.java.basic;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Name> set = new HashSet<Name>();
		Name n1 = new Name("neven","chen");
		Name n2 = new Name("nevenc","chen");
		set.add(n1);
		set.add(n2);
		System.out.println(set.size());
		System.out.println(set.contains(n1));
		System.out.println(set.contains(n2));

	}

	
}
class Name{
	private String first;
	private String last;
	
	Name(String first, String last){
		this.first=first;
		this.last=last;
	}
	
	public String toString(){
		System.out.println("ToString is called.");
		return this.first+this.last;
	}

	public int hashCode(){
		System.out.println("HashCode is called.");
		System.out.println(first.hashCode());
		return first.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("Equls is called.");return false;
//		if(o.getClass() == Name.class){
//			Name tem = (Name) o;
//			return tem.first.equals(this.first) && tem.last.equals(this.last);
//		}
//		return false;
	}
}