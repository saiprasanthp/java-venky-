package com.collections.demo;

import java.util.HashSet;
import java.util.*;

public class HashSetdemo {

	public static void main(String[] args) {
		HashSet g=new HashSet();
		g.add("1");
		g.add("a");
		g.add("A");
		g.add("1");
		g.add("pueieie");
		g.add("piisiis");
		g.add("aaaa");
		System.out.println(g);
		Iterator h=g.iterator();
		while(h.hasNext()) {
			Object c=h.next();
			Object b="A";	
		}
		if(g.contains("1")) {
			g.add("kl");
		}
		System.out.println(g);
	} 
}
