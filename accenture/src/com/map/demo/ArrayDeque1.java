package com.map.demo;
import java.util.*;
class MyComp2 implements Comparator{
	

	public int compare(Object arg0, Object arg1) {
		String s1=(String)arg0;;
		String s2=(String)arg1;
		return s1.compareTo(s2);	
	}
	}
	



public class ArrayDeque1 {
	public static void main(String[] args) {
		PriorityQueue j=new PriorityQueue(21,new MyComp2());
		j.offer("ravi");
		j.offer("jai");
		j.offer("ram");
		ArrayDeque ad=new ArrayDeque(j);
		System.out.println(ad);	
	}
}
