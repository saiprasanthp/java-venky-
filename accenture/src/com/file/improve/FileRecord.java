package com.file.improve;

import java.util.Scanner;

public class FileRecord {
	String name;
	
		public FileRecord(String name) {
			this.name=name;
	}
		public String[] ink() {
			String[] j=new String[2];
			Scanner l=new Scanner(System.in);
			System.out.println("enter name");
			String j1=l.next();
			System.out.println("enter name");
			String j2=l.next();
			l.close();
			j[0]=j1;
			j[1]=j2;
			return j;	
		} 
		public String toString() {
			return name;
		}
	public static void main(String[] args) {
		FileRecord h=new FileRecord("sai");
		System.out.println(h);
		String[] k=h.ink();
		for(String l:k) {
			System.out.println(l);
		}
	}

}
