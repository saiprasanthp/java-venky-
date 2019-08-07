package com.collections.demo;
import java.util.*;
class MyComparatorDemo implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer first=(Integer)obj1;
		Integer second=(Integer)obj2;
		if(first>second) 
			return +1;
		else if(first<second)
			return -1;
		else
			return 0;	
	}
}
public class ComparatorAscendingDemo {

	public static void main(String[] args) {
		MyComparatorDemo comparator=new MyComparatorDemo();
		TreeSet t=new TreeSet(comparator);
		t.add(10);
		t.add(2);	
		t.add(0);
		t.add(20);
		t.add(100);
		t.add(20);
		System.out.println(t);
	}

}
