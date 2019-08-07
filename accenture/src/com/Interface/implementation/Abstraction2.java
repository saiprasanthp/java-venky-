package com.Interface.implementation;
abstract class Develop11{
	abstract public void m1();
	abstract public void m2();
	
}
abstract class Develop1 extends Develop11{
	public void m1() {
		System.out.println("hai");
	}
}
class Develop2 extends Develop1{
	public void m2() {
		System.out.println("haai2");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		Develop11 h=new Develop2();
		h.m2();
		h.m1();
		
	}

}
