package com.Interface.implementation;
interface I{
	abstract public void a();
	abstract public void b();
	abstract public void c();
	abstract public void d();
}
abstract class A implements I{
	public void b() {
		System.out.println("b method");
	}
} class B extends A{
	public void a() {
		System.out.println("a method");
		
	}
	public void c() {
		System.out.println("c method");
		
	}
	public void d() {
		System.out.println("d method");
		
	}
	public void b() {
		System.out.println("overriden method");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		I obj=new B();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		
		B obj1=new B();
		obj1.a();
		obj1.b();
		obj1.c();
		obj1.d();
	}

}
