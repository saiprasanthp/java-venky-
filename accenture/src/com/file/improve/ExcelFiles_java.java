package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ExcelFiles_java {

	public static void main(String[] args) {
		try {
			Properties p=new Properties();
		BufferedReader al=new BufferedReader(new FileReader("F:\\k.properties"));
		p.load(al);
		String n=p.getProperty("sai");
		System.out.println(n);
	
		
		al.close();
		
		
		}catch(Exception e) {
			
		}
		
		

	}

}
