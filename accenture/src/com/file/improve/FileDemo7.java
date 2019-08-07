package com.file.improve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo7 {

	public static void main(String[] args) {
		try {
			BufferedWriter f=new BufferedWriter(new FileWriter("F:\\kilo.txt") );
			BufferedReader h=new BufferedReader(new FileReader("F:\\kilo.txt"));
			f.write("manu");
			f.newLine();
			f.write(101);
			String s=h.readLine(); 
		
			while(s!=null){
				System.out.println(s);
				s=h.readLine();
			}
			h.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
