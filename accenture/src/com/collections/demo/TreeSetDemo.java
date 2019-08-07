package com.collections.demo;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(11);
		ll.add(99);
		ll.add("jiop");
		SortedSet ss=new TreeSet();
		ss.add(11);
		ss.add("gi");
		ss.add('k');
		TreeSet j=new TreeSet(ss);
		TreeSet j1=new TreeSet(ll);
		System.out.println(j1);
		
		/*Integer i=10;
		String h=Integer.toString(i);
		j.add("sai");
		j.add(h);
		System.out.println(j);*/
		//System.out.println(j);
	}
}
