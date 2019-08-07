package com.collections.com;
import java.util.*;
class Comk implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer second=(Integer)obj1;
		Integer first=(Integer)obj2;
		return 
				-second.compareTo(first);
	}
}
public class CollectionsClass {

	public static void main(String[] args) {
		Comk h=new Comk();
		List list=new ArrayList();
		list.add(9);
		list.add(19);
		list.add(92);
		list.add(39);
		list.add(29);
		list.add(99);
		//list.add(null);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		int k=Collections.binarySearch(list, 19);
		System.out.println(k);
		Collections.sort(list, h);
		System.out.println("comparator"+list);
		int i=Collections.binarySearch(list, 19,h);
		System.out.println(i);
		int m=Collections.binarySearch(list, 0, h);
		System.out.println("insertion point"+m);
	}
}
