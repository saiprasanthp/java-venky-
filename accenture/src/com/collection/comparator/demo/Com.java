package com.collection.comparator.demo;

import java.util.Comparator;
import java.util.TreeSet;
class Demo implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Student5 j1=(Student5)obj1;
		int rollno1=j1.rollno;
		Integer i1=new Integer(rollno1);
		Student5 j2=(Student5)obj2;
		int rollno2=j2.rollno;
		Integer i2=new Integer(rollno2);
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return +1;
		}else {
			return 0;
		}
	}
}


class Student5 implements Comparable{
	int rollno;
	String name;
	public Student5(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return rollno+" "+name;
	}
	public int compareTo(Object obj) {
		Student5 s1=(Student5)obj;
		int rollno1=s1.rollno;
		int rollno2=this.rollno;
		if(rollno1>rollno2) {
			return -1;
		}else if(rollno1<rollno2) {
			return +1;
		}else {
			return 0;
		}
	}

}

public class Com {

	public static void main(String[] args) {
		Student5 s1=new Student5(101,"raja");
		Student5 s2=new Student5(110,"sandeep");
		Student5 s3=new Student5(10,"deva");
		Student5 s4=new Student5(199,"mohan");
		TreeSet t=new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println("comparable of asecending order "+t);
		TreeSet t1=new TreeSet(new Demo());
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		System.out.println("comparator descending order"+t1);		

	}
}
