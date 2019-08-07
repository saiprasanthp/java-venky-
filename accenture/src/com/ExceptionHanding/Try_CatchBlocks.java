package com.ExceptionHanding;

public class Try_CatchBlocks {

	public static void main(String[] args) {
		try {
			System.out.println("hai");
			try {
				System.out.println("hai1");
			}finally {
				System.out.println("hello");
			}
		}catch(Exception e){
			System.out.println("catch");
		}
	}
}
