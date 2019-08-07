package com.collections.demo;
import java.util.*;

public class PriorityQueue1 implements Comparator {
	public int compare(Object obj1,Object obj2) {
		String i1=(String)obj1;
		String i2=(String)obj2;
		return -i1.compareTo(i2);
	}

	public static void main(String[] args) {
		PriorityQueue1 h=new PriorityQueue1();
		PriorityQueue p=new PriorityQueue(10,h);
		p.offer("9");
		p.offer("2");
		p.offer("1");
		p.offer("11");
		p.offer("21");
		p.offer("19");
		p.offer("131");
		p.offer("41");
		System.out.println(p);
	}
}
