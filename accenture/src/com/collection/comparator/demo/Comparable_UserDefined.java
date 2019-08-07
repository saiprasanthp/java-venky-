package com.collection.comparator.demo;
//comparator_userDefined
import java.util.*;
class Customer implements Comparable{
	int rollno;
	String name;
	Customer(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return rollno+" "+name;
	}
	public int compareTo(Object obj) {
		int i1=this.rollno;
		Customer id=(Customer)obj;
		int i2=id.rollno;
		if(i1>i2) {
			return -1;
		}else if(i1<i2) {
			return +1;
		}else {
			return 0;
		}	
	}
}
public class Comparable_UserDefined {

	public static void main(String[] args) {
		Customer c1=new Customer(101,"raja");
		Customer c2=new Customer(104,"ravi");
		Customer c3=new Customer(110,"raghu");
		Customer c4=new Customer(113,"ram");
		TreeSet t=new TreeSet();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		System.out.println(t);
	}
}
