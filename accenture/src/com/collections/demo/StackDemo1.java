package com.collections.demo;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack d=new Stack();
		PriorityQueue f=new PriorityQueue();
		d.push("sai");
		Object k=d.pop();
		System.out.println(k);
		ArrayList a=new ArrayList(d);
		System.out.println(a);
		System.out.println(d);
	}

}
