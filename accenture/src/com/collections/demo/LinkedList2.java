package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("hello");
		System.out.println(ll);
		String s=ll.removeFirst();
		System.out.println(s);
		System.out.println(ll);
		try {
		String c=ll.removeLast();
		System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
		}
		ll.add("sai1");
		ll.add("sai2");
		ll.add("sai3");
		ll.add("sai4");
		ll.add("sai5");
		ll.add("sai6");
		ll.addLast("jiii");
		System.out.println(ll);
		int i=ll.indexOf("sai2");
		System.out.println(i);
		boolean f=ll.contains("sai2");
		System.out.println(f);
		Object[] o=ll.toArray();
		for(Object l:o) {
			System.out.println(l);
		}
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(ll);
		Iterator<String> l=al.iterator();
		while(l.hasNext()) {
			Object s1=l.next();
			System.out.println(s1);
		}
		int m=al.indexOf("sai1");
		System.out.println(m);
	}
}
