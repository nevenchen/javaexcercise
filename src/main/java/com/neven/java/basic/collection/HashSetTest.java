package com.neven.java.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {
	
	/**
	在java的集合中，判断两个对象是否相等的规则是： 
	1)，判断两个对象的hashCode是否相等 ,如果不相等，认为两个对象也不相等，完毕 .如果相等，转入2) 
	（这一点只是为了提高存储效率而要求的，其实理论上没有也可以，但如果没有，实际使用时效率会大大降低，
	所以我们这里将其做为必需的。后面会重点讲到这个问题。） 
	2)，判断两个对象用equals运算是否相等 
	如果不相等，认为两个对象也不相等 
	如果相等，认为两个对象相等（equals()是判断两个对象是否相等的关键） 
	为什么是两条准则，难道用第一条不行吗？不行，因为前面已经说了，hashcode()相等时，equals()方法也可能不等，
	所以必须用第2条准则进行限制，才能保证加入的为非重复元素。 
	比如下面的代码：
	 */
	@Test
	public void putString(){
		String s1 = new String("neven");
		String s2 = new String("neven");
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.hashCode());// s1.hashcode()等于s2.hashcode()
		System.out.println(s2.hashCode());
		Set<String> hashset = new HashSet<String>();
		hashset.add(s1);
		hashset.add(s2);
		
		System.out.println(hashset.size());
		Iterator<String> it = hashset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void method2(){
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
				System.out.println("Equls is called.");
				if(o.getClass() == Name.class){
					Name tem = (Name) o;
					return tem.first.equals(this.first) && tem.last.equals(this.last);
				}
				return false;
			}
			
		}
		
		Name std1 = new Name("neven","chen");
		Name std2 = new Name("neven","chen");
		
		Set<Name> students = new HashSet<Name>();
		students.add(std1);
		students.add(std2);
		
		System.out.println(students.size());
		
		Iterator<Name> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
