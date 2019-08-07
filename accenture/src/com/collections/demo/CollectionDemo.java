package com.collections.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("sai");
		list.add("manu");
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"sai");
		
	}

}
