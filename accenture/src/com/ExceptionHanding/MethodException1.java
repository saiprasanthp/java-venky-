package com.ExceptionHanding;

public class MethodException1 {

	public static void main(String[] args) {
		try {
		getDetails();
		System.out.println("jjjj");
		}catch(Exception e) {
			System.out.println("hi");
		}
	}public static void getDetails() { 
		getMoreDetails();
		System.out.println("hello");
	}
	private static void getMoreDetails() {
		System.out.println(100/0);
	}	
}