package com.Wrapper.classes;

import java.util.TreeMap;

public class WrapperClasses {
	
	public static void main(String[] args) {
		Float f=new Float(12.2f);
		Float f1=new Float("12.2f");
		System.out.println(f1);
		System.out.println(f);
		Integer i=new Integer("10");
		String s="123";
		int k=Integer.parseInt(s);
		System.out.println(k);
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(i, "sai");
		System.out.println(t);
	}

}
