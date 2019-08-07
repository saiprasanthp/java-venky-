package com.collections.demo;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue h=new PriorityQueue();
		h.add("gai");
		h.add("k");
		h.add("l");
		//h.add(10);
		h.offer("jai");
		System.out.println(h.peek());
		System.out.println(h.poll());
		System.out.println(h.remove());
		System.out.println(h.element());
		System.out.println(h);
		Vector v=new Vector(h);
		Enumeration j=v.elements();
		while(j.hasMoreElements()) {
			Object o=j.nextElement();
			System.out.println(o);
		}
		ArrayList al=new ArrayList(v);
		al.add(10);
		Iterator l=al.iterator();
		while(l.hasNext()) {
			Object o=l.next();
			System.out.println(o);
		}
		ListIterator ll=al.listIterator();
		while(ll.hasNext()) {
			Object obj=ll.next();
		System.out.println(obj);
		if(obj.equals("l")) {
			ll.set("j");
		}
		if(obj.equals(10)) {
			ll.set("sai");
		}
		}
		System.out.println(al);
	}

}
