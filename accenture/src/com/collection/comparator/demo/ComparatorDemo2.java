package com.collection.comparator.demo;
import java.util.*;
class Compa implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee1 h1=(Employee1)obj1;
		Employee1 h2=(Employee1)obj2;
		int i1=h1.rollno;
		int i2=h2.rollno;
		if(i1>i2) {
			return -1;

		}else if(i1<i2) {
			return +1;
		}else {
			return 0;
		}
	}

}
class Employee1{

	int rollno;
	String name;
	Employee1(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return rollno+" "+name;
	}
}
public class ComparatorDemo2 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(101,"naga");
		Employee1 e2=new Employee1(103,"ram");
		Employee1 e3=new Employee1(102,"ramraju");
		TreeSet t=new TreeSet(new Compa());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
	}

}
