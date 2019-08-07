package com.collections.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethod{

	public static void main(String[] args) {
		Collection<String> cr=new ArrayList<String>();
		Collection<Character> ch=new ArrayList<Character>();
		ch.add('a');
		cr.add("string");
		//cr.remove("string");
		cr.removeAll(cr); 
		System.out.println(cr.retainAll(ch));
		System.out.println(cr.contains("string"));
		cr.containsAll(cr);
		int i=cr.size();
		System.out.println(i);
		boolean u=cr.isEmpty();
		System.out.println(u);
		Iterator<String> f=cr.iterator();
		while(f.hasNext()) {
			System.out.println(f.next());
		}
		Object[] t=cr.toArray();
		for(Object j:t) {
			System.out.println(j);
		}
	}

}
