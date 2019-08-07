package com.ExceptionHanding;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}catch(Exception e) {
			
		}finally {
			try {
			System.out.println(100/0);
			}catch(Exception e) {
				throw new ArithmeticException("hai");
			}
			
		}

	}

}
