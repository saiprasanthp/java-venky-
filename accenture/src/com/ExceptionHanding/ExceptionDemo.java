package com.ExceptionHanding;

public class ExceptionDemo {

	public static void main(String[] args) {
		getDetails();
	}
	
	public static void getDetails()  {
		getMoreDetails();	
	}
	public static void getMoreDetails() {
		try {
		System.out.println(100/0);
		
		}catch(ArithmeticException e) {
			System.out.println(100/10);
			
			
		}catch(Exception e) {
			System.out.println(190/10);
		}
	}
	

}
