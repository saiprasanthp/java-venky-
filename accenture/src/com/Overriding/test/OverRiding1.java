package com.Overriding.test;
interface A{
	public abstract void m1();
}
interface B{
	public abstract void m1(int i);
}
class C implements A,B{
	public void m1() {
		System.out.println("hiii");
	}
	public void m1(int i) {
		System.out.println(i);
	}	
}
public class OverRiding1 {

	public static void main(String[] args) {
		C v=new C();
		v.m1();
		v.m1(10);
	}
}
