package com.inheritance;



class Parent{
	public void check(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Overriding extends Parent{
	public void check(float a,float b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		Overriding j=new Overriding();
		j.check(10.2f, 10.6f);
		j.check(10, 20);
	}
}