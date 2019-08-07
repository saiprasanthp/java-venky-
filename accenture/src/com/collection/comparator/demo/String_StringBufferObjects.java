package com.collection.comparator.demo;
import java.util.*;
class MyComp implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		int i1=s1.length();
		int i2=s2.length();
		if(i1==i2) {
			return 
					-1;
		}else if(i1>i2) {
			return
					+1;
		}else if(i1<i2) {
			return 
					-1;
		}else {
			return 0;
		}
	}
	
}

public class String_StringBufferObjects {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComp());
		t.add("hello");
		t.add(new StringBuffer("reverse"));
		t.add("gu");
		t.add(new StringBuffer("kol"));
		System.out.println(t);
	}

}
