package com.map.demo;
import java.util.*;
public class MapPractiseDemo {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, "jai");
		m.put(109, "kishore");
		m.put(103, "teja");
		m.put(105, "vijay");
		Set list=m.keySet();
		ArrayList arr=new ArrayList();
		Iterator i=list.iterator();
		while(i.hasNext()) {
			arr.add(i.next());	
		}
		System.out.println(arr);
		for(int j=0;j<arr.size();j++) {
			Object k=arr.get(j);
			System.out.println(k);
		}
		ArrayList arr1=new ArrayList();

		Set set=m.entrySet();
		Iterator it=set.iterator(); 
		while(it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();
			arr1.add(m1);
			
		}
		System.out.println("1"+arr1);
		String s2="jai";
		Iterator it1=arr.iterator();
		while(it1.hasNext()) {
			Object obj=it1.next();
			Integer i1=(Integer)obj;
			String s=Integer.toString(i1);
			if(s.equals("101")) {
				System.out.println(arr.get(0));
				break;
			}
		}
		
		 
	}
}
