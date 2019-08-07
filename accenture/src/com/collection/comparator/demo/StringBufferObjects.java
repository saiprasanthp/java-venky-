package com.collection.comparator.demo;
import java.util.*;
class My implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return 
				s1.compareTo(s2);
	}
	
}
public class StringBufferObjects {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new My());
		t.add(new StringBuffer("String"));
		t.add(new StringBuffer("String buffer"));
		t.add(new StringBuffer("wrong"));
		t.add(new StringBuffer("k"));
		System.out.println(t);

	}

}
