package com.collections.demo;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Properties;

public class PropertieDemo {

	public static void main(String[] args) throws Exception{
		Properties pc=new Properties();
		FileInputStream fs=new FileInputStream("db.properties");
		pc.load(fs);
		System.out.println(pc.getProperty("url"));
		BufferedWriter bf=new BufferedWriter(new FileWriter("java.txt"));
		pc.setProperty("k", "j");
		pc.setProperty("k", "l");
		pc.store(bf,null);	
	}
}
