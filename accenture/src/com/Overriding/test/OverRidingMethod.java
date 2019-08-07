package com.Overriding.test;
class Over{
	synchronized public void m1() {
		System.out.println("hi");
	}
	strictfp public void m2() {
		System.out.println("strictfp");
	}
}
class MethodOver extends Over{
	synchronized public void m1() { 
		System.out.println("hi1");
	}
	strictfp public void m2() {
		System.out.println("strictfp2");
	}
}
public class OverRidingMethod {

	public static void main(String[] args) {
		MethodOver h=new MethodOver();
		h.m1();
		h.m2();
		
	}

}
