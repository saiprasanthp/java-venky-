package com.collections.demo;
import java.util.*;
class MyComparator1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		int i1=s1.length();
		int i2=s2.length();
		if(s1.equals(s2)) {
			return 0;
		}
		if(i1==i2) {
			return -1;
		}else if(i1>i2){
			return -1;
			
		}else {
			return +1;
		}
	}
}
public class ComparatorDemo1 {
	public static void main(String[] args) {
		MyComparator1 my=new MyComparator1();
		TreeSet t=new TreeSet(my);
		t.add("Subbu");
		t.add("Venky");
		t.add("Sai");
		t.add("Raju");
		t.add("Ravi");
		t.add("Rajeshwari");
		t.add("Ravisharmaajay");
		t.add("l");
		t.add("l");
		t.add("Rajesh");
		System.out.println(t);
	}
}
