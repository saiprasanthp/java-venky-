package com.collections.demo;
import java.util.*;
class Demo{
	int rollno;
	String name;
	Demo(int rollno,String name){
		this.rollno=rollno;
		this.name=name;	
	}	
}
class Demo1 extends Demo{
	Demo h;
String k;
	public Demo1(Demo h) {
		super(101,"sai");
		
	}
	public String toString() {
		return rollno+" "+name;
	}	
}
public class ArrayListDemoObject {
	public static void main(String[] args) {
		Demo h=new Demo(101,"sai");
		Demo1 j=new Demo1(h);
		ArrayList<Demo1> al=new ArrayList<Demo1>();
		al.add(j);
		ListIterator<Demo1> aa=al.listIterator();
		while(aa.hasNext()) {
			System.out.println(aa.next());
		}
	}
}
