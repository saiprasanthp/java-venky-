package com.collections.demo;
import java.util.*;

public class QueueDemo2 {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.offer(1);
		q.offer(12);
		q.offer(13);
		q.offer(14);
		q.offer(0);
		q.offer(2);
		System.out.println(q);
		ArrayDeque d1=new ArrayDeque();
		d1.offer(10);
		d1.offer(1);
		d1.offer(12);
		d1.offer(11);
		d1.offer(10);
		//d1.offer(null);
		System.out.println(d1);
		HashMap f=new HashMap();
		f.put(101, "hai");
		System.out.println(f);
	}

}
