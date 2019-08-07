package com.collection.comparator.demo;
import java.util.*;
class MyCom implements Comparator{
	public int compare(Object obj1,Object obj2) {
	Student s1=(Student)obj1;
		Integer k1= s1.rollno;
		Student s2=(Student)obj1;
		Integer k2=s2.rollno;
		return s1.compareTo(s2);
		/*if(k1>k2) {
			return -1;
		}else if(k1<k2) {
			return +1;
		}else {
			return 0;
		}*/	
	}
	
}
class Student extends MyCom implements Comparable{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return rollno+" "+name;
	}
	public int compareTo(Object obj) {
		int s1_rollno=this.rollno;
		Integer i1=new Integer(s1_rollno);
		System.out.println(i1);
		Student s=(Student)obj;
		int s2_rollno=s.rollno; 
		Integer i2=new Integer(s2_rollno);
		System.out.println(i2);
		if(i2>i1) {
			return -1;
		}else if(i2<i1) {
			return +1;
			
		}else {
			return 0;
		}
 

		
	}
}
public class UsingOurOwnComparaor {

	public static void main(String[] args) {
		Student s1=new Student(101,"sai");
		Student s2=new Student(102,"manu");

		MyCom j=new MyCom();
		TreeSet<Student> t=new TreeSet<Student>(j);
		t.add(s1);
		t.add(s2);
		System.out.println(t);
	}

}
