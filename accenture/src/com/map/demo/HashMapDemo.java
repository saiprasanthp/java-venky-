package com.map.demo;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(101, 101); 
		h.put(102, 101);
		h.put(103, 101);//insertion not preserved
		h.put(104, 101);
		h.put(105, 101);
		h.put(101, 102);
		System.out.println(h);
		IdentityHashMap j=new IdentityHashMap();
		j.put(101, 101); 
		j.put(102, 101);
		j.put(null, 101);//insertion not preserved
		j.put(104, 101);
		j.put(105, 103);
		j.put(101, 102);
		System.out.println(j);
		LinkedHashMap map=new LinkedHashMap();
		map.put(101, "ss");
		map.put(102, "ss");//insertion order is not preserved 
		map.put(null, "ss");
		map.put(104, "ss");
		map.put(105, "ss");
		System.out.println(map);	
	}
}
