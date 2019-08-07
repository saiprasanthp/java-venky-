package com.Interface.implementation;
interface Mouse{
	public abstract void m1();
	public static final int i=19;
}
abstract class Mouse1 implements Mouse{
	int j=90;
	public void m1() {
		System.out.println(Mouse.i);
	}
	public abstract void m2();
}
class Mouse2 extends Mouse1{
	int i=20;
	public void m2() {
		System.out.println(i);
		System.out.println(j);
	}
}
public class My_Interface_Demo {

	public static void main(String[] args) {
		Mouse k=new Mouse2();
		k.m1();
		Mouse2 n=new Mouse2();
		n.m2();
		
	}

}
