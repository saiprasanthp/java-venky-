package com.ExceptionHanding;

import java.io.FileReader;

public class DefaultException_Handler  {
	public void m1() throws Exception{
		try {
		FileReader f=new FileReader("C:\\urst");
		f.read();
		f.close();
		}catch(Exception e) {
			
		}
	}
	public void m2() throws Exception{
		try {
			System.out.println(100/0);
		}catch(Exception e) {
			System.out.println("100");
		}
	}

	public static void main(String[] args) {
		DefaultException_Handler h=new DefaultException_Handler();
		try {
		h.m1();
		}catch(Exception e)
		{
			
		}
		try {
		h.m2();
		}catch(Exception e) {
			
		}
	}
		
}
     