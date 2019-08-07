package com.collection.comparator.demo;
import java.util.*;
class Comparator4 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		/*return
		s2.compareTo(s1);*/
		return
				-s1.compareTo(s2);
	}	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		Comparator4 h=new Comparator4();
		TreeSet t=new TreeSet(h);
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("O"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}
}
