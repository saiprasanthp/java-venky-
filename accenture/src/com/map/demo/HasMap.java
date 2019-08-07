package com.map.demo;

import java.util.HashMap;

public class HasMap {

	public static void main(String[] args) {
		HashMap a=new HashMap();
		a.put(102, "sai");
		a.put(null, "k");
		a.put(101, "kaka");
		System.out.println(a);
		if(a.containsKey(101)) {
			Object o=a.get(101);
			System.out.println(o);
			System.out.println("hello");
		}

	}

}
