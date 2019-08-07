package com.collection.comparator.demo;
import java.util.*;

class StringBuffer1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s2=obj1.toString(); 
		String s1=obj2.toString();
		return 
				s1.compareTo(s2);	
	}	
}
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer1 h=new StringBuffer1();
		TreeSet t=new TreeSet(h);
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("A"));
		System.out.println(t);
	}

}
