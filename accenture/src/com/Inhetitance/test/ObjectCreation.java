package com.Inhetitance.test;
class First{
	public void m1() {
		System.out.println("m1");
		
	}
}
class Second extends First{
	public void m2() {
		System.out.println("m2");
	}
	
}

public class ObjectCreation {

	public static void main(String[] args) {
		
		Second j=new Second();
		j.m1();
		j.m2();
		

	}

}
