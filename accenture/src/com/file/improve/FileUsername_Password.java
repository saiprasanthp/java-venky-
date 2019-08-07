package com.file.improve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
class Gette_Sett1{
	String username;
	String password;
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}

}

public class FileUsername_Password extends Gette_Sett1{
	public void User_Pass() throws Exception {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\own.txt"));
		String s=bf.readLine();
		String[] k=new String[50];
		int i=0;
		int j=1;
		int counter=0;
		while(s!=null) {
			if(i==j-i) {
				k=s.split(":");
				super.setUsername(k[i-1]);
				super.setPassword(k[j-i]);
				System.out.println(k[i-1]);
				System.out.println(k[j-i]);
				break;
				
				
			}
			if(counter==0) {
				i=0;
				j=1;
				
			}
			i++;
			j++;
			s=bf.readLine();
			
		}
		bf.close();
	}

	public static void main(String[] args) {
		FileUsername_Password j=new FileUsername_Password();
		try {
		j.User_Pass();
		}catch(Exception e) {
			e.printStackTrace();
		}
		Gette_Sett1 l=new Gette_Sett1();
		System.out.println(l.getUsername());
		System.out.println(l.getPassword());
		
	}

}
