package com.collections.demo;
import java.util.*;
class MyComparator3 implements Comparator{
	char[] ch=new char[200];
	char[] ch1=new char[200];

	String n;
	String n1;

	public int compare(Object obj1,Object obj2) {
		String s1=(String)obj1;
		String s2=(String)obj2;
		for(int i=s1.length();i>0;i--) {
			ch[i]=s1.charAt(i-1);
			//String n=new String(ch);
		}for(int i=s2.length();i>0;i--) {
			ch1[i]=s2.charAt(i-1);
			//String n1=new String(ch1);
		}
		System.out.println(n);
		System.out.println(n1);
		String n=new String(ch);
		String n1=new String(ch1);

		int k=n.length();
		int m=n1.length();

		if(k==m) {
			return -1;
		}else if(k>m){
			return -1;

		}else {
			return +1;
		}	
	}
}

public class Comparatpr2 {

	public static void main(String[] args) {
		MyComparator3 j=new MyComparator3();
		TreeSet h=new TreeSet(j);
		h.add("sai");
		h.add("ravi");
		h.add("manu");
		h.add("jai");
		h.add("kishore");
		System.out.println(h);
	}

}
