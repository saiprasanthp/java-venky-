 package com.Interface.implementation;
 interface I1{
	 public abstract void m1();
	 public abstract void m2();
 }
 abstract class First1 implements I1{
	 public void m2() {
		 System.out.println("m2");
	 }
 }
 class First extends First1{
	 public void m1() {
		 System.out.println("hai");
	 }
	 
 }

public class ObjectCreation {

	public static void main(String[] args) {
		I1 h=new First();
		h.m1();
		h.m2();

	}

}
