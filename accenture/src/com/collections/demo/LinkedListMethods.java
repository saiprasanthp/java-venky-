package com.collections.demo;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai0");
		ll.add(1,"sai1");
		System.out.println(ll);
		System.out.println(ll.offer("sai2"));
		System.out.println(ll);
		System.out.println(ll.offerFirst("sai10"));
		System.out.println(ll);
		System.out.println(ll.offerLast("sai20"));
		System.out.println(ll);
		System.out.println("peek:"+ll.peek());
		System.out.println("peekfirst:"+ll.peekFirst());
		System.out.println("peeklast:"+ll.peekLast());
		System.out.println("poll:"+ll.poll());
		System.out.println("pollfirst:"+ll.pollFirst());
		System.out.println("polllast:"+ll.pollLast());
		System.out.println("final linkedlist:"+ll);
		ll.clear();
		System.out.println(ll);
	}

}
