package com.collections.demo;
import java.util.*;
class Book{
	int rollno;
	String name;
	Book(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return rollno+" "+name;
	}
}
public class LinkedListDemo4 {

	public static void main(String[] args) {
		Book d1=new Book(101,"ramesh");
		Book d2=new Book(102,"suresh");
		LinkedList<Book> v=new LinkedList<Book>();
		v.add(d1);
		v.add(d2);
		ListIterator<Book> l=v.listIterator();
		while(l.hasNext()) {
			Object c=l.next();
			System.out.println(c);
		}
		System.out.println(v);
		

	}

}
