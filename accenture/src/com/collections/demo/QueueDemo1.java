package com.collections.demo;
import java.util.*;

public class QueueDemo1 {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.offer("sai");
		q.offer("ji");
		q.offer("los");
		//q.offer(null);
		System.out.println(q);//ji,sai,los
		PriorityQueue j=new PriorityQueue();
		j.offer("vijay");
		j.offer("balaram");
		j.offer("venky");
		//j.offer(null);

		System.out.println(j);//venky,vijay,balaram
		ArrayDeque d=new ArrayDeque();
		d.offer("vijay");
		d.offer("balaram");
		d.offer("venky");
		//d.offer(null);
		System.out.println(d);//vijay,balaram,venky
		d.poll();//vijay and removes vijay
		System.out.println(d);//balaram,vijay
		Object o=d.peek();
		System.out.println(o);//it retrives first and doesnt remove the element
		System.out.println(d);//balaram,venky
		Object v=d.remove();
		System.out.println(v);//balaram and remove from the queue
		System.out.println(d);//[venky]
		Object f=d.element();
		System.out.println(f);//[venky]
		d.poll();
		System.out.println(d);
		//d.remove();
		//System.out.println(d);
		


	}

}
