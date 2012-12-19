package com.neven.java.basic.collection;

import java.util.Set;
import java.util.TreeSet;


public class Compare {
	
	public static void main(String[] args){
		Cat a = new Compare().new Cat("a");
		Cat b = new Compare().new Cat("a");
		
		Set<Cat> cats = new TreeSet<Cat>();
		cats.add(a);
		cats.add(b);
		System.out.println("cats size: "+cats.size());
		System.out.println(a.compareTo(b));
		for(Cat c : cats){
			System.out.println(c);
		}
		
		Integer c = new Integer(5);
		Integer d = new Integer(5);
		Integer e = new Integer(4);
		Set set = new TreeSet();
		set.add(c);
		set.add(d);
		set.add(e);
		for(Object o : set){
			System.out.println((Integer)o);
		}
		
		Dog dog1 = new Compare().new Dog("dog1");
		Dog dog2 = new Compare().new Dog("dog2");
		
		/*由于dog没有实现comparable,加入第二个dog到set时会跑出运行时异�?
		 * （加入第二个的时候会调用与第�?��进行compareTo()比较�?
		 */
		Set dogSet = new TreeSet();
		dogSet.add(dog1);
//		dogSet.add(dog2);
	}
	
	class Dog{
		String name ;
		public Dog(String name){this.name = name;}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String toString() {
			return this.name;
		}
		
	}
	
	class Cat implements Comparable<Object>{

		public String toString() {
			return this.name;
		}
		public int compareTo(Object o) {
			if(o.toString().equals(this.name)){
				return 0;
			}
			return -1;
		}

		public boolean equals(Object obj) {
			return true;
		}
		public Cat(String name){
			this.name = name;
		}
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

}
