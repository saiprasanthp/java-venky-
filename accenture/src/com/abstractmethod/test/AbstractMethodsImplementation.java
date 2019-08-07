package com.abstractmethod.test;
abstract class Abb{
	int i;
	Abb(int i){
		this.i=i;
		System.out.println(i);
		
	}
	public abstract void m1();
	public static void m2() {
		//we can not override a static method
	}
}
class Ex extends Abb{
	
	Ex(int i) {
		super(i);
		System.out.println(i);
		}

	public void m1() {
		System.out.println("enter name");
		
	}	
}

public class AbstractMethodsImplementation {

	public static void main(String[] args) {
		Abb j=new Ex(10);
		j.m1();
	}

}
