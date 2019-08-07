package com.ExceptionHanding;

import java.io.IOException;

public class Try_Catch_Demo {

	public static void main(String[] args) throws Throwable {
		try {
			
			System.out.println(100/0);
			
		}catch(ArithmeticException e) {	
			e.printStackTrace();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
