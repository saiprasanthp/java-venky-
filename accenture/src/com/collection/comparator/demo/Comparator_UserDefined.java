package com.collection.comparator.demo;
//comparator for user DefinedClass
import java.util.*;
class Compl1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String h1=(String)obj1;
		String h2=(String)obj2;
		return 
				h1.compareTo(h2);
	}
}
class Student2{
	int rollno;
	String name;
	public Student2(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public String display() {
		return rollno+" "+name;
	}	
}
public class Comparator_UserDefined {

	public static void main(String[] args) {
		Student2 h1=new Student2(101,"raja");
		String s1=h1.display();
		Student2 h2=new Student2(109,"ravi");
		String s2=h2.display();
		Student2 h3=new Student2(100,"teja");
		String s3=h3.display();
		Student2 h4=new Student2(99,"rajaravi");
		String s4=h4.display();
		TreeSet t=new TreeSet(new Compl1());
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println(t);
	}
}
