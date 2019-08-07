package com.map.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Invalid extends RuntimeException{
	
}
public class DataFromText {

	public static void main(String[] args) throws IOException {
		int i=0;
		FileWriter pf=new FileWriter("C:\\Users\\user\\eclipse-workspace\\accenture\\src\\com\\map\\demo\\map.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\accenture\\src\\com\\map\\demo\\map.txt"));
		String line=bf.readLine();
		while(line!=null) {	
			String[] user_pwd=line.split(":");
			if(username.equals(user_pwd[i]) && password.equals(user_pwd[i+1])) {
				System.out.println("enter into home page");
				break;
			}else {
				line=bf.readLine();
			}
		}
		if(line==null) {
			System.out.println("no records found");
			System.out.println("enter click for sign up keyword 0 for backpage press 1");
			int k=	sc.nextInt();
			if(k==0 || k==1) {
				switch(k) {
				case 0:
					System.out.println("enter details and signup");
					System.out.println("enter username");
					String new_user=sc.next();
					System.out.println("enter password");
					String new_pswd=sc.next();
					pf.write("\n");
					pf.write(new_user+":"+new_pswd);
					System.out.println("successful");
					break;	
				case 1:
					System.out.println("back page");
					break;
				}  
			}else {
				throw new Invalid();
			}
		}
		pf.close();
		sc.close();
		bf.close();	
	}
}