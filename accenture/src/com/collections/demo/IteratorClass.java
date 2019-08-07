package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("java class");
		al.add("hello");
		al.add("hi");
		al.add("hello1");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}

}
