package com.getters.setters.com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class gettersSetters {
	public String username;
	public String password;
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
	public String[] file() throws Exception {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (17).txt"));
		String[] l=new String[7];
		String[] k=new String[7];
		String line=bf.readLine();
		int i=0;
		while(line!=null) {
			l=line.split(":");
			k[i]=l[0]+l[1];
			Scanner s=new Scanner(System.in);
			System.out.println();
			if(l[1].equals("sai1")) {
				gettersSetters m=new gettersSetters();
				m.setPassword(l[1]);
				System.out.println("password is correct");	
			}
			line=bf.readLine();
			i++;
		}
		
		return k;
	}
}
