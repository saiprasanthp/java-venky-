package com.Interface.implementation;
interface Interface1{
	abstract public void m1();
	abstract public void  m2();	
}
abstract class Class1 implements Interface1{
	public void m1() {
		System.out.println("m1 method");
	}
	abstract public  void m2();
}
class Class2 extends Class1 {
	public void m2() {
		System.out.println("m2 method");
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Class2 d=new Class2();
		d.m1();
		d.m2();
	}
}
