package com.map.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemoPractise {

	public static  void main(String[] args) {
		TreeMap<Integer,String> tr=new TreeMap<Integer,String>();
		tr.put(109, "jai");
		tr.put(103, "ki");
		tr.put(102, "oi");
		Set<Entry<Integer,String>> str=tr.entrySet();
		Iterator<?> i=str.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer,String> en=(Map.Entry<Integer, String>)i.next();
			System.out.println(en.getKey()+"="+en.getValue());
		}
	}
}
