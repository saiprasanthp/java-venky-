package com.collection.array.methods.com;

import java.util.Arrays;
import java.util.Comparator;
class Mycum implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return -i1.compareTo(i2);
	}
}
public class ArrayMethods {
	
	public static void main(String[] args) {
		Mycum j=new Mycum();
		Integer[] in= {20,40,80,10};
		Arrays.sort(in);
		for(Integer k:in) {
			System.out.println(k);
		}
		for(int i=0;i<in.length;i++) {
			System.out.println(in[i]);
		}
		Arrays.sort(in, j);
		for(int i=0;i<in.length;i++) {
			System.out.println(in[i]);
		}
	}
}