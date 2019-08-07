package com.collections.demo;
import java.lang.reflect.Method;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Object o=new Stack();
		Class c=o.getClass();
		Method[] m=c.getDeclaredMethods();
		for(Method k:m) {
			System.out.println(k.getName());
		}
		Stack s=new Stack();
		s.add("sai");
		s.add("jai");
		s.add("ki");
		System.out.println(s);
		Object k=s.pop();
		System.out.println(k);
		System.out.println(s);
		Object n=s.peek();
		System.out.println(n);
		System.out.println(s);
		s.push("hi");
		System.out.println(s);
		System.out.println(s.empty());
		int i=s.search("sai");
		System.out.println(i);
		Enumeration e=s.elements();
		while(e.hasMoreElements()) {
			Object x=e.nextElement();
			System.out.println(x);
		}
		Iterator f=s.iterator();
		while(f.hasNext()) {
			Object z=f.next();
			System.out.println(z);
			//f.remove();
		}
		s.add("janam");
		System.out.println(s);
		System.out.println(f);
		ListIterator ll=s.listIterator();
		while(ll.hasNext()) {
			Object z=ll.next();
			int i1=s.indexOf(z);
			Object m1=ll.previousIndex();
			System.out.println(i1);
			System.out.println(z);
			ll.add("m");
			//System.out.println(m1);
			
		}
		System.out.println(s);

	}

}

