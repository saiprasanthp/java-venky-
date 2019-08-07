package com.collections.demo;

import java.util.PriorityQueue;
import java.util.*;
class Queue1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return -i1.compareTo(i2); 	
		}
}
public class QueueDemoList {

	public static void main(String[] args) {
		Queue1 h=new Queue1();
		Queue d=new PriorityQueue();
		d.add(10);
		d.add(100);
		d.add(110);
		d.add(120);
		d.add(120);
		d.add(103);
		System.out.println(d);
		PriorityQueue pq=new PriorityQueue(10,h);
		pq.add(10);
		pq.add(100);
		pq.add(110);
		pq.add(120);
		pq.add(120);
		pq.add(103);
		System.out.println(pq);
		ArrayDeque ar=new ArrayDeque();
		ar.add(10);
		ar.add(100);
		ar.add(110);
		ar.add(120);
		ar.add(120);
		ar.add(103);
		System.out.println(ar);
	}
}
