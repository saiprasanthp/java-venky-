package com.collections.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add("jai");
		Iterator<String> i=ll.descendingIterator();
		while(i.hasNext()) {
			Object b=i.next();
			System.out.println(b);	
		}
	}

}
