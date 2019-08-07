package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class AddCollection {

	public static void main(String[] args) {
		
		ArrayList h= new ArrayList();
		h.add(1);
		h.add("hello");
		h.add('a');
		h.add("hi");
		ArrayList h1=new ArrayList();
		h1.add("jeep");
		h1.add("scooty");
		h.addAll(2, h1);
		Iterator f=h.iterator();
		while(f.hasNext()) {
			System.out.println(f.next());
		}
	}
}
