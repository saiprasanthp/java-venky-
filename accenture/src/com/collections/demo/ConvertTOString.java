package com.collections.demo;
import java.util.*;

public class ConvertTOString {
	public String[] los() {
		ArrayList<String> k=new ArrayList<String>();
		k.add("sai"); 
		k.add("hello"); 
		System.out.println(k);
		String[] q=new String[k.size()];
	for(int i=0;i<k.size();i++) {   
		q[i]=k.get(i);
	}
	return q;
	}
	public static void main(String[] args) {
		ConvertTOString h=new ConvertTOString();
		String[] as=h.los();
		for(String f:as) {
			System.out.println("String conflicts:"+f);
		}
	}
}
