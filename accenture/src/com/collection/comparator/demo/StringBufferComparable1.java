package com.collection.comparator.demo;
import java.util.*;
/*class MyClass implements Comparable{
	public int compareTo(Object obj) {
		String s2=obj.toString();
		String s1=obj.toString();
		return 
				s1.compareTo(s2);
		
	}
}*/
class MyClass implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s2=obj1.toString();
		String s1=obj2.toString();
		return 
				s2.compareTo(s1);
		
	}
}

public class StringBufferComparable1 {

	public static void main(String[] args) {
		//MyClass h=new MyClass();
		TreeSet g=new TreeSet(new MyClass());
		g.add(new StringBuffer("A"));
		g.add(new StringBuffer("M"));
		g.add(new StringBuffer("L"));
		g.add(new StringBuffer("R"));
		g.add(new StringBuffer("A"));
		System.out.println(g);

		

	}

}
