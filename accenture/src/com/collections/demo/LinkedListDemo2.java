package com.collections.demo;

import java.util.Iterator;
import java.util.LinkedList;

class Link{
	int rollno;
	String name;
	String city;
	public Link(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		
	}
public String toString() {
	return rollno+" "+name+" "+city;
}
}

public class LinkedListDemo2 {

	public static void main(String[] args) {
		Link k1=new Link(101,"sai","nlr");
		Link k2=new Link(102,"manu","nlr");
		Link k3=new Link(103,"chai","nlr");
		LinkedList<Link> ll=new LinkedList<Link>();
		ll.add(k1);
		ll.add(k2);
		ll.add(k3);
		//System.out.println(ll.peek());
		Iterator<Link> l=ll.iterator();
		while(l.hasNext()) {
			Object s=l.next();
			System.out.println(s);
		}
	}

}
