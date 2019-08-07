package com.collection.comparator.demo;
import java.util.*;
class Kill implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		//TreeSet u=new TreeSet();
		String first=(String)obj1;
		String second=(String)obj2;
		char[] first1=first.toCharArray();
		char[] first11=new char[first1.length];
		for(int i=0;i<first1.length;i++) {
			first11[i]=first1[first1.length-1-i];
		}
		char[] second1=second.toCharArray();
		char[] second11=new char[second1.length];
		for(int i=0;i<second1.length;i++) {
			second11[i]=second1[second1.length-1-i];
		}
		String s1=new String(first11);
		String s2=new String(second11);
		int i=s1.compareTo(s2);
		if(i==-1) {
			return +1;
		}else if(i==+1) {
			return +1;
		}else {
			return +1;
		}
		
	}
}
public class ComparatorStrings {
	public static void main(String[] args) {
		TreeSet h=new TreeSet(new Kill());
		h.add("hello world");
		h.add("hello");
		h.add("loss");
		System.out.println(h);
	}
}
