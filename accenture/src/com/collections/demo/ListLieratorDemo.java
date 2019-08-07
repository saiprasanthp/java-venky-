package com.collections.demo;
import java.util.*;
class ListIt{
	public void check() {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("hai"); 
		ar.add("hello");
		ar.add(101);
		ar.add(1011);
		ListIterator ll=ar.listIterator();
		while(ll.hasNext()) {
			Object o=ll.next();
			//System.out.println(o);
			ll.add("lo");
		}
		System.out.println(ar);
	}
}
public class ListLieratorDemo {

	public static void main(String[] args) {
		ListIt iterat=new ListIt();
		iterat.check();
	}
}
