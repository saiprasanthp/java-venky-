package com.collections.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add(1, "sai1");
		ll.addFirst("hi");
		ll.addLast("jai");
		LinkedList<String> ll1=new LinkedList<String>();
		ll1.add("manu");
		ll1.addFirst("manu1");
		ll.addAll(ll1);
		ll.addAll(1,ll1);
		System.out.println("copy"+ll.clone());
		System.out.println(ll.contains("sai1"));
		Iterator<String> h=ll.descendingIterator();
		while(h.hasNext()) {
			Object s=h.next();
			System.out.println(s);
		}
		System.out.println("first"+ll.element());
		System.out.println(ll.get(1));
		int i=ll.indexOf("sai1");
		System.out.println(i);
		System.out.println(ll);
		ListIterator<String> h1=ll.listIterator();
		while(h.hasNext()) {
			Object s=h.next();
			System.out.println(s);   
		}
		System.out.println("offer:"+ll.offer("sai"));
		System.out.println("peek:"+ll.peek());
		System.out.println("pop:"+ll.pop());
		ll.push("sai1");
		String s=ll.peekFirst();
		System.out.println(s);
		
	}
}
 