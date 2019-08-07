package com.collection.comparator.demo;
import java.util.*;
class Employee implements Comparable{
	String name;
	int rollno;
	Employee(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	} public String toString() {
		return name+" "+rollno;
	}
	public int compareTo(Object obj) {
		int id1=this.rollno;
		Employee em=(Employee)obj;
		int id2=em.rollno;
		if(id1>id2) {
			return +1;
		}else if(id1<id2) {
			return -1;
		}else {
			return 0;
		}
	}
	

}class Comp implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee em1=(Employee)obj1;
		Employee em2=(Employee)obj2;
		String name1=em1.name;
		String name2=em2.name;
		return 
				name1.compareTo(name2);	
	}
}
public class CompComp {

	public static void main(String[] args) {
		Employee em1=new Employee("venky",100);
	    Employee em2=new Employee("chiru",10);
		Employee em3=new Employee("balaiah",101);
		Employee em4=new Employee("venky",100);
		TreeSet t=new TreeSet();
		t.add(em1);
		t.add(em2);
		t.add(em3);
		t.add(em4);
		System.out.println(t);
		TreeSet t1=new TreeSet(new Comp());
		t1.add(em1);
		t1.add(em2);
		t1.add(em3);
		t1.add(em4);
		System.out.println(t1);
	}

}
