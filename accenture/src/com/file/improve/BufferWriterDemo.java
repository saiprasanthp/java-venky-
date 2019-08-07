package com.file.improve;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterDemo {

	public static void main(String[] args) {
		try {
		BufferedWriter f=new BufferedWriter(new FileWriter("F:\\jai.txt"));
		char[] ch= {'a','s','d'};
		f.write(ch);
		f.newLine();
		f.write(ch);
		f.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
