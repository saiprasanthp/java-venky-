package com.Interface.implementation;

import java.io.File;
import java.io.FileReader;

//filedemo 

public class FileDemo2 {

	public static void main(String[] args) {
		try {
		File f=new File("F:\\sai");
		f.mkdir();
		f.delete();
		System.out.println(f.isDirectory());
		FileReader f1=new FileReader("F:\\New Text Document (3).txt");
		int i;
		while((i=f1.read())!=-1){
			System.out.print((char)i);	
		}
		f1.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	
	}

}
