package com.map.demo;
import java.util.*;

public class MapDemo2 {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(101, "sai");
		t.put(106, "sai");
		t.put(100, "sai");
		t.put(104, "sai");
		t.put(102, "sai");
		t.put(101, "sai1");
		Set i=t.keySet();
		Iterator k=i.iterator();
		while(k.hasNext()) {
			System.out.println(t.get(k.next()));
		}
		

		
		

	}

}
