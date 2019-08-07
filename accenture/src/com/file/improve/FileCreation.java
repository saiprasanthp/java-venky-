package com.file.improve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCreation {
	public void method() throws Exception{
	//	BufferedWriter bf=new BufferedWriter(new FileWriter("F:\\practise1.txt"));
		FileOutputStream f=new FileOutputStream("F:\\practise1.txt");
		BufferedReader fi=new BufferedReader(new FileReader("F:\\practise.txt"));
		String s=fi.readLine();
		while(s!=null) {
			byte[] j=s.getBytes();
			f.write(j);
			//bf.newLine();
			s=fi.readLine();
			if(s==null) {
				System.out.println("file is loaded");
				break;
			}	
		}
		f.close();
		fi.close();
		
	}

	public static void main(String[] args) {
		FileCreation h=new FileCreation();
		try {
		h.method();
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}
}
