package com.ExceptionHanding;

public class Try_Catch {

	public static void main(String[] args) {
		System.out.println("hai");
		try {
		System.out.println(100/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");

	}

}
