package com.file.improve;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamPractise {

	public static void main(String[] args) {
		try {	
		FileInputStream g=new FileInputStream("F:\\New Text Document.txt");
		int i=g.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=g.read();
		}
		FileOutputStream k=new FileOutputStream("F:\\New1.txt");
		String s="sai";
		byte[] b=s.getBytes();
		k.write(b);
		k.close();
		g.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
