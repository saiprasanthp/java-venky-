package com.ExceptionHanding;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsException1 {
	

	public static void main(String[] args) throws IOException {
		try {
		getDetails();	
		}catch(Exception e) {
			e.printStackTrace();
		}
		FileReader f=new FileReader("F://mm.txt");

	}
	public static void getDetails() throws Exception {
		FileReader f=new FileReader("F://mm.txt");
		getMoreDetails();
		
	}
	public static void getMoreDetails() {
		System.out.println(100/0);
	}
}
