package com.collections.demo;
import java.util.*;

public class EvenNumberInCollection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		int n=100;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				al.add("even number"+i);
				
			}else {
				al1.add("odd number"+i);
			}
		}
		al1.addAll(al);
		al1.retainAll(al);
		ListIterator ll=al1.listIterator();
		while(ll.hasNext()) {
			Object c=ll.next();
			System.out.println(c);
		}
	}
}
