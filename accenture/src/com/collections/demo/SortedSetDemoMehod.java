package com.collections.demo;
import java.util.*;

public class SortedSetDemoMehod {

	public static void main(String[] args) {
		SortedSet j=new TreeSet();
		j.add("a");
		j.add("m");
		j.add("s");
		j.add("c");
		j.add("z");
		j.add("d");
		j.add("10");
		System.out.println(j);
		TreeSet t=new TreeSet(j);
		System.out.println(t);
		System.out.println(t.first()); 
		System.out.println(t.last());
		SortedSet m=t.headSet("c");
		System.out.println(m);
		SortedSet l=t.tailSet("z");
		System.out.println(l);
		SortedSet b=t.subSet("c","d");
		System.out.println(b);
		System.out.println(t.comparator());
	}
}
