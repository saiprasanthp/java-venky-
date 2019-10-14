package com.collections.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListPractise {

	public static void main(String[] args) {


		ArrayList<String> al=new ArrayList<String>();
		al.add("sai1");
		al.add("sai2");
		al.add("sai3");
		al.add("sai4");
		al.add("sai5");
		al.add("sai6");
		al.add("sai7");
		al.add("sai8");
		al.add("sai9");
		System.out.println(al);

		List<String> kk=new ArrayList<String>();

		for(int i=0;i<al.size();i++) {
			kk.add(al.get(i));	
			
		}
		System.out.println(kk);
		LinkedList<String> ll=new LinkedList<String>();
		ll.addFirst("ll");
		ll.addFirst("mmm");
		System.out.println(ll);
		if(al.contains("sai1")) {
			System.out.println("lllll yes it exists");
		}else {
			System.out.println("not exists");
		}
		System.out.println(al.contains("sai1"));
		Vector<Integer> mm=new Vector<Integer>();
		mm.add(10);
		System.out.println(mm);
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		System.out.println(l);
		
		
	}
	
}
