package com.inheritance;

public class Overloading {
	public void m1(int i,float b) {
		System.out.println(i);
		System.out.println(b);
	}
	public void m1(float a,int i) {
		System.out.println(a);
		System.out.println(i);
	}
	public static void main(String[] args) { 
		Overloading j=new Overloading();
		j.m1(10f, 20);
		j.m1(10, 10f);
	}
}