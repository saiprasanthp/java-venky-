package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilePractise2 {
	public void m1() {
		try {
			String[] k=new String[2];
		FileReader g=new FileReader("F:\\vijay.txt");
		int i=g.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=g.read();
		}g.close();	
		}catch(Exception e) {		
		}
	}
	
	public static void main(String[] args) {
		FilePractise2 k=new FilePractise2();
		k.m1();
		
		try {
			String[] j=new String[2];
		BufferedReader h=new BufferedReader(new FileReader("F:\\vijay.txt"));
		String s=h.readLine();
		while(s!=null) {
			if(s.equals("hello")) {
				System.out.println("hello");
			}
			if(s.equals("10")) {
				System.out.println("10");
			}
			s=h.readLine();
		}
		h.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
