package com.collections.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsPractise {

	public static void main(String[] args) {

		ArrayList<Integer>  al=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {

			al.add(i);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		Integer name=	sc.nextInt();
		if(al.contains(name)) {
			System.out.println("is there");
		}
		System.out.println(al);
		LinkedList<Integer> li=new LinkedList<Integer>(al);
		System.out.println(li);

		Vector<Integer>  vv=new Vector<Integer>(al);
		Stack<Integer> st=new Stack<Integer>();
		st.add(10);
		System.out.println(st);


		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(30);
		t.add(1);
		System.out.println(t);

		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("sai", 1);
		h.put("manu", 2);
		h.put("los", 3);
		h.put("jj", 4);
		System.out.println(h);
		Set<String> a=	h.keySet();
		Iterator<String> it=a.iterator();
		while(it.hasNext()) {
			String l=it.next();
			System.out.println(l);
		}
		Collection<Integer>  kk=h.values();
		Iterator<Integer> l=kk.iterator();
		while(l.hasNext()) {
			Integer m=	l.next();
			System.out.println(m);
		}
		Object[] v=		al.toArray();
		for(int i=0;i<v.length;i++) {
			System.out.println(v[i]);
		}
	}
}