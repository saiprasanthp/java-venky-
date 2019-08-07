package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilesPractise1 {

	public static void main(String[] args) {
		try {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (6).txt"));
		BufferedReader bf2=new BufferedReader(new FileReader("F:\\New Text Document (7).txt"));

		String s=bf.readLine();
		String s2=bf2.readLine();
		while(s!=null) {
			System.out.println(s);
			System.out.println(s2);
			s=bf.readLine();
			System.out.println(s);
			s2=bf2.readLine();
			System.out.println(s2);
			if(s==null||s2==null) {
				System.out.println("sai");
			}
		}
		bf.close();
		bf2.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
