package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		List<String> list1=new LinkedList<String>();

		System.out.println(list.add("sachin"));
		System.out.println(list.add("man"));
		list.add(0, "satring");
		Iterator<String> g=list.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}
		String s=list.remove(0);
		System.out.println(s);
		System.out.println(list.get(0));
		list.set(0, "sai");
		System.out.println(list1.addAll(list));
		Iterator<String> j=list1.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
	}

}
