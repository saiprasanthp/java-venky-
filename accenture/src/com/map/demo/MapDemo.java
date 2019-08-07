package com.map.demo;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		HashSet h2=new HashSet();
		h2.add(1);
		h2.add(2);
		h2.add("sai");
		h2.add("sa");
		h2.add(10);
		System.out.println(h2);
		Map h=new HashMap();
		h.put(101, "sai");
		h.put(102, "ji");
		h.put(101, "kishore");
		System.out.println(h);
		Map h1=new HashMap();
		h1.putAll(h);
		System.out.println(h1);
		Object m=h1.get(101);
		System.out.println(m);
		System.out.println(h1.containsKey(101));
		System.out.println(h1.containsValue('a'));
		System.out.println(h1.isEmpty());
		System.out.println(h1.size());

	}

}
