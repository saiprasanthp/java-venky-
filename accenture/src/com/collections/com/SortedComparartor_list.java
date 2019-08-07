package com.collections.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class Conn implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}	
}
public class SortedComparartor_list {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.add(6);
		ll.add(0);
		System.out.println("orginal"+ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.sort(ll, new Conn());
		System.out.println(ll);
		int i=Collections.binarySearch(ll, 0, new Conn());
		System.out.println(i);	
	}
}
