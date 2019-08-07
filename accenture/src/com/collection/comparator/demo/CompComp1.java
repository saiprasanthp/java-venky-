package com.collection.comparator.demo;
import java.util.*;
class Student1 implements Comparable{
	int rollno;
	String name;
	static String college="gist";
	Student1(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return rollno+" "+name+" "+college;
	}
	public int compareTo(Object obj) {
		String name1=this.name;
		Student1 j=(Student1)obj;
		String name2=j.name;
	
	return name1.compareTo(name2);
	}
	
}
class Comp2 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Student1 m1=(Student1)obj1;
		Student1 m2=(Student1)obj2;
		Integer i1=m1.rollno;
		Integer i2=m2.rollno;
		if(i1>i2) {
			return 
					+1;
		}else if(i1<12) {
			return -1;
		}else {
			return 0;
		}
		
		
	}
	
}

public class CompComp1 {

	public static void main(String[] args) {
		
		Student1 j1=new Student1(101,"ravi");
		Student1 j2=new Student1(102,"nag");
		Student1 j3=new Student1(103,"chiru");
		Student1 j4=new Student1(104,"balu");

		TreeSet h=new TreeSet();
		h.add(j1);
		h.add(j2);
		h.add(j3);
		h.add(j4);
		System.out.println(h);
		TreeSet h1=new TreeSet(new Comp2());
		h1.add(j1);
		//h1.add(j1);
		h1.add(j2);
		h1.add(j3);
		h1.add(j4);
		System.out.println(h1);
	}

}
