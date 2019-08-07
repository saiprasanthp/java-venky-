package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) {
		try {
			String s;
		BufferedReader f=new BufferedReader(new FileReader("F:\\New Text Document (3).txt"));
		while((s=f.readLine())!=null) {
			System.out.println(s);		
		}
		f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
