package com.collections.demo;
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer first=(Integer)obj1;
		Integer second=(Integer)obj2;
		if(first>second) {
			return -1;
		}
		else if(first<second) {
			return +1;
		}
		else {
			return 0;
		}	
	}
}
public class TreeSetComparableDemo {

	public static void main(String[] args) {
		MyComparator obj=new MyComparator();
		TreeSet t=new TreeSet(obj);
		t.add(10);
		t.add(1);
		t.add(13);
		t.add(20);
		t.add(50);
		t.add(10);
		System.out.println(t);
	}

}
