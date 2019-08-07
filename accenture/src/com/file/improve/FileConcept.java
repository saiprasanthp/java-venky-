package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileConcept {

	public static void main(String[] args) {
		BufferedReader bf1=null;
		BufferedReader bf2=null;
		try {
			bf1=new BufferedReader(new FileReader("F:\\New Text Document (6).txt"));
			bf2=new BufferedReader(new FileReader("F:\\New Text Document (7).txt"));
			String s1=bf1.readLine();
			String s2=bf2.readLine();
			Scanner f=new Scanner(System.in);
			System.out.println("enter pnr");
			String pnr=f.next();
			while(s1!=null) {
				String[] j=s1.split(":");
				String []l=s2.split(":");
				if((pnr.equals(j[1]))&&(j[1].equals(l[1])))
				{
					System.out.println(s2);
					break;
				}else {
					s1=bf1.readLine();
					s2=bf2.readLine();	 
				}
				if(s1==null) {
					throw new Exception("pnr not found");
				}
				f.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			bf1.close();
			bf2.close();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
		}
	}
}
