package com.setters.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SettersFiles {
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
	public void loss() throws Exception{
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter username");
		String user=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		if(user.equals(username)&&(pass.equals(password))) {
			System.out.println("okay login");
		}else {
			throw new Exception("invalid");
		}
		
	}
	public static void main(String[] args) throws Exception{
		SettersFiles j=new SettersFiles();
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (18).txt"));
		String name=bf.readLine();
		String[] k=new String[2];
		int i=0;
		while(name!=null) {
			k=name.split(":");
			if(k[i].equals("username")) {
				j.setUsername(k[i+1]);
			}
			if(k[i].equals("password")) {
				j.setPassword(k[i+1]);
			}
			name=bf.readLine();
		}
		System.out.println(j.username);
		System.out.println(j.password);
		j.loss();
	}
}