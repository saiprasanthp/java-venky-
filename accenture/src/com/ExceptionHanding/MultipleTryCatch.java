package com.ExceptionHanding;

public class MultipleTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("hello1");
			System.out.println("hello2");
			try {
				System.out.println("hello3");
				try {
				System.out.println(100/0);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("ko");
		}

	}

}
