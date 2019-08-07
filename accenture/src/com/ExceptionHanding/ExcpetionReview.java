package com.ExceptionHanding;

import java.io.FileReader;
import java.io.IOException;

public class ExcpetionReview {

	public static void main(String[] args)  {
		FileReader g = null;
		try {
			 g=new FileReader("c:user//");
			 g.read();
			 g.close();
			 
		}catch(Exception e) {
			e.printStackTrace();	
		}
		finally {
			System.out.println("hai");
		}
		try {
			g.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
