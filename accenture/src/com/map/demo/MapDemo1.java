package com.map.demo;
import java.util.*;

public class MapDemo1 {

	public static void main(String[] args) {
		Map h=new HashMap();
		h.put(101, "sai");
		h.put(102, "sai1");
		h.put(103, "sai2");
		h.put(100, "sai3");
		h.put(104, "sai4");
		Set m1=h.entrySet();
		Iterator it=m1.iterator();
		while(it.hasNext()) {
			/*Object o=it.next();
			System.out.println(o);
			*/
			Map.Entry k1=(Map.Entry)it.next();
			System.out.println(k1.getKey());
			if(k1.getKey().equals(101)) {
				k1.setValue(1000);
			}
		}
		Set i=h.keySet();
		System.out.println(i);
	Object o=h.get(100);
	System.out.println(o);
		System.out.println(h);
		


	}

}
