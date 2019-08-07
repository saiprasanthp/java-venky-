package com.map.demo;
import java.util.*;
class Pop implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer first=(Integer)obj1;
		Integer Second=(Integer)obj2;
		return Second.compareTo(first);
	}
}
public class MapUsingComparator {

	public static void main(String[] args) {
		int[] c= {10,20,30};
		//int[] z=new int[90];
		Integer[] k=new Integer[10];
		TreeMap map=new TreeMap(new Pop());
		map.put(109, "sai");
		map.put(101, "k");
		map.put(110, "a");
		System.out.println(map);
		Set b=map.keySet();
		Iterator i=b.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		Integer loss=sc.nextInt();
		while(i.hasNext()) {
			Object l=i.next();
			if(l.equals(loss)) {
				Object o=map.get(loss);
				System.out.println(o);
				break;
			}else {
				System.out.println("not exists");
				break;
			}
		}
	}
}