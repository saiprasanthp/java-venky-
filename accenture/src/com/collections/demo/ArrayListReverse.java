package com.collections.demo;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListReverse {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("hai");
		al.add("2");
		al.add("3");
		Object[] b=al.toArray();
		for(int i=b.length;i>0;i--) {
			System.out.println(b[i-1]);
		}
	}
}
 