package com.Interface.implementation;
class Parent {
	public void m1() {
		System.out.println("hai1");
	}
	
}
abstract class Child extends Parent{
	public void m2() {
		super.m1();
		System.out.println("hai2");
	}
	abstract public void m3();
}
class Child1 extends Child{
	public void m3() {
		super.m2();
		System.out.println("hai3");
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		Child1 h=new Child1();
		h.m3();
	}

}
