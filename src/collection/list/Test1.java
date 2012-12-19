package collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class Test1{
	
	public static void main(String[] args){
		//define a comparator
		Comparator comparator = new Comparator(){
			public int compare(Object o1, Object o2) {
				return (Character)o1 - (Character)o2;
			}
		};
		Character[] abcd = new Character[]{'a','b','g','e'};
		List list = Arrays.asList(abcd);
		printList(list);
		Collections.sort(list,comparator);
		printList(list);
	}
	
	static void printList(List list){
		for(Object o  : list){
			System.out.println(o);
		}
	}
	
	static void printSet(Set list){
		for(Object o  : list){
			System.out.println(o);
		}
	}
}
