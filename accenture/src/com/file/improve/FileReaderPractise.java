package com.file.improve;

import java.io.FileReader;

public class FileReaderPractise {

	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("F:\\New Text Document.txt");
		int i=fr.read();//read() return int 
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();//close()
		}catch(Exception e) {
			
		}

	}

}
