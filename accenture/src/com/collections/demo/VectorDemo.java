package com.collections.demo;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector vec = new Vector(); 
		for(int i=2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					vec.add(j);	
				}
			}
		}
		Enumeration i=vec.elements();
		while(i.hasMoreElements()) {
			Object c=i.nextElement();
			System.out.println(c);
		}





	}

}
