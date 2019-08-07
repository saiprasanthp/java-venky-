package com.collections.com;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayList_to_Array implements Comparator{

	public static void main(String[] args) {
		Object[] k= {10,20,40};
	String j=	k.toString();
		
		ArrayList al=new ArrayList();
     	al.add(10);
		al.add(1);
		System.out.println(al);
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		Integer i1=(Integer)arg0;
		Integer i2=(Integer)arg1;
		return -i1.compareTo(i2);
	}

	

}
