package com.file.improve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReader1 {

	public static void main(String[] args) {
		try {
		BufferedWriter j=new BufferedWriter(new FileWriter("F:\\pra.txt"));
		j.write("sai");
		j.newLine();
		j.write(10);
		BufferedReader g=new BufferedReader(new FileReader("F:\\pra.txt"));
 		int a;
 		System.out.println("h");
		while((a=g.read())!=-1) {
			System.out.println((char)a);
			a=g.read();
		}
		j.flush();
		j.close();
		g.close();  
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
