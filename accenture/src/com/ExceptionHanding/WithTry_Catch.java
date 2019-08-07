package com.ExceptionHanding;

public class WithTry_Catch {

	public static void main(String[] args) {
		try {
			details();
		}catch(Exception e) {

		}
		System.out.println("h");
		m1();
		details();
	}
	public static void  details() {
		getMoreDetails();
		System.out.println("hai");
		System.out.println("hello");
	}
	public static void getMoreDetails() {
		System.out.println(100/0);
	}
	public static void m1() {
		System.out.println("mmkk");
	}
}
