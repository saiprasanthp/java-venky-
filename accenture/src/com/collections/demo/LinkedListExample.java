package com.collections.demo;

import java.util.ArrayList;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		Integer h=new Integer(10);
		LinkedList<String> g=new LinkedList<String>();
		g.add(0, "lo");
		g.add("sai");
		System.out.println(g);
		ArrayList<String> j=new ArrayList<String>(g);
		Iterator<String> k=j.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		j.add(1, "manu");
		j.add("jai");
		j.remove(2);
		System.out.println(j.isEmpty());
		System.out.println(j);
	}

}
