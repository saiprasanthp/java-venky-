package com.abstractmethod.test;
abstract class D{
	D(){
		System.out.println("d constractor");
	}
	public abstract void m1();
	public void m2() {
		
	}
}
class D1 extends D{
	public void m1() {
		
	}
}

public class AbstractConstructor {

	public static void main(String[] args) {
		D f=new D1();
		f.m1();
		f.m2();
	}
}
