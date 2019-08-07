package com.strings;

public class StringsPractise1 {
	String rollno;
	String name;
	StringsPractise1(String rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
	}
	public String toString() {
		return rollno+" "+name;
	}
	public static void main(String[] args) {
		StringsPractise1 d=new StringsPractise1("101","sai");
		StringsPractise1 d1=new StringsPractise1("102","manu");
		System.out.println(d);
		System.out.println(d1);	
	}

}
