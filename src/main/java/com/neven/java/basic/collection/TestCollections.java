package com.neven.java.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestCollections {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new BookType("1", "k"));
		list.add(new BookType("5", "z"));
		list.add(new BookType("4", "g"));
		Comparator OrderIsdn = new Comparator() {

			public int compare(Object o1, Object o2) {
				BookType b1 = (BookType) o1;
				BookType b2 = (BookType) o2;
				return (b1.getIdsn().hashCode() - b2.getIdsn().hashCode());
			}
		};
		Comparator OrderName = new Comparator() {

			public int compare(Object o1, Object o2) {
				BookType b1 = (BookType) o1;
				BookType b2 = (BookType) o2;
				return (b1.getName().hashCode() - b2.getName().hashCode());
			}
		};
		Collections.sort(list, OrderName);
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			BookType ss = (BookType) list.get(i);
			System.out.print(ss.getIdsn());
			System.out.println(ss.getName());
		}
	}
}
