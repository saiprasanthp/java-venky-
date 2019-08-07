package com.constructor.test;
class Student{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public void m1() {
		System.out.println("yssusjk");
	}
}
class Student1{
	Student d;
	String name1="hai";
	Student1(Student d){
		this.d=d;
		System.out.println(d.rollno);
	}
}
public class ConstructorDemoPassing {

	public static void main(String[] args) {
		Student d=new Student(101,"sai");
		Student1 g=new Student1(d);
		System.out.println(g.name1+d.name+d.rollno);
		d.m1();
	}
}