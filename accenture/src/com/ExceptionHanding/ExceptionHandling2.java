package com.ExceptionHanding;

import java.io.IOException;

public class ExceptionHandling2 extends Throwable{
	

	public static void main(String[] args) throws ExceptionHandling2 {
		throw new ExceptionHandling2();
		
	}
	
}
