package com.collections.demo;
import java.util.*;


public class ArrayDequeComparator implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		Integer s1=(Integer)obj1;
		Integer s2=(Integer)obj2;
		return -s1.compareTo(s2);	
	}
	

	public static void main(String[] args) {
		//  SortedSet se=new TreeSet();
		ArrayDeque l=new ArrayDeque();
		l.offer(10);
		l.offer(1);
		l.offer(5);
		l.offer(11);
		System.out.println(l);
		TreeSet t1=new TreeSet(new ArrayDequeComparator());
		Iterator it=l.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			t1.add(obj);
		}
		ArrayDeque dl=new ArrayDeque(t1);
		System.out.println(dl);
	}
}
