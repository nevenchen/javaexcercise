package com.neven.java.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	/**
	 * @Description:
	 *在java的集合中，判断两个对象是否相等的规则是：
		1)，判断两个对象的hashCode是否相等
		如果不相等，认为两个对象也不相等，完�?
		如果相等，转�?)
		（这�?��只是为了提高存储效率而要求的，其实理论上没有也可以，但如果没有，实际使用时效率会大大降低，所以我们这里将其做为必�?��。后面会重点讲到这个问题。）
		2)，判断两个对象用equals运算是否相等
		如果不相等，认为两个对象也不相等
		如果相等，认为两个对象相等（equals()是判断两个对象是否相等的关键�?
		为什么是两条准则，难道用第一条不行吗？不行，因为前面已经说了，hashcode()相等时，equals()方法也可能不等，�?��必须用第2条准则进行限制，才能保证加入的为非重复元素�?
		比如下面的代码：

	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String args[]) {
		
		//method1();
		method2();
	}
	
	
	static void method1(){
		String s1 = new String("neven");
		String s2 = new String("neven");
		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.hashCode());// s1.hashcode()等于s2.hashcode()
		System.out.println(s2.hashCode());
		Set hashset = new HashSet();
		hashset.add(s1);
		hashset.add(s2);
		
		/*实际上hashset中只添加进了�?��“neven”，这是因为按照java判断对象是否相等的规则（set中不能有重复的对象，否则后面添加的将替代之前的）
		 * 1: hashcode相等，进�?
		 * 2�? equals()也相等，
		 * hashset会得出如下结论： s1,s2为同�?��象； s2替代掉s1
		 * 
		 */
		System.out.println(hashset.size());
		Iterator it = hashset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/**
	 * @Description:method2能够添加s1，s2是因为他们是不同的对象hashcode,equals都为false
	 *
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	static void method2(){
		class Student{
			private String name;

			public String toString() {
				return this.name;
			}
			public Student(String name){
				this.name = name;
			}
			
		}
		
		Student std1 = new Student("neven");
		Student std2 = new Student("neven");
		
		System.out.println(std1.hashCode() == std2.hashCode());//false; 原因：Object.hashCode()比较的是对象的引用地�?��hash�?
		System.out.println();
		
		System.out.println(std2.equals(std1));
		
		Set<Student> students = new HashSet<Student>();
		students.add(std1);
		students.add(std2);
		
		System.out.println(students.size());
		
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
