package com.ExceptionHanding;

public class ExceptionHandlingThro {

	public static void main(String[] args) {
		ExceptionHandlingThro j=new ExceptionHandlingThro();
		try {
		j.m1();
		}catch(Exception e) {
			System.out.println("hi");
		}
	}
	public void m1() {
		m2();
	}
	public void m2() {
		m3();
		System.out.println("hai");
	}
	public void m3() {
		System.out.println(100/0);
	}
}
