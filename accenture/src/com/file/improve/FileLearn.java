package com.file.improve;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FileLearn {

	public static void main(String[] args) throws Exception {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\own.txt"));
	String s=	bf.readLine();
		InputStream in=new FileInputStream("F:\\own.txt");
		while(s!=null) {
			byte[] byt=s.getBytes();
		for(int j=0;j<byt.length;j++) {
			System.out.print((char)byt[j]);
		}
			System.out.println();
			s=bf.readLine();
		}
		bf.close();
		in.close();
		mi();

	}public static void mi() throws IOException {
		InputStream in=new FileInputStream("F:\\own.txt");
	int i=	in.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=in.read();
	}
	in.close();	
	}
}
