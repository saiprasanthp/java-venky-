package com.file.improve;
//bufferedReader cant communicate directly with the file so we have to use writer

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterPractise {

	public static void main(String[] args) {
		try {
			BufferedWriter g=new BufferedWriter(new FileWriter("F:\\vijay.txt"));
			g.write("hello");
			g.newLine();//newline will be added
			g.write("10");
			g.newLine();//newline will be added
			g.flush();//flush method
			g.close();//close method	
		}catch(Exception e) {
			
		}
		

	}

}
