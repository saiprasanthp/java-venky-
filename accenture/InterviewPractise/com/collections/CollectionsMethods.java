package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Comp implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer a=(Integer)obj1;
		Integer a2=(Integer)obj2;
		return -a.compareTo(a2);	
	}
}
public class CollectionsMethods {

	public static void main(String[] args) {
		Comp kk=new Comp();
		List al=new ArrayList();
		al.add(10);
		al.add(1);
		al.add(20);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, kk);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		Integer[] man={10,30,1,44};
		Arrays.sort(man);
		for(Integer l:man) {
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}