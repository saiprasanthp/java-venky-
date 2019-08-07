package com.file.improve;

import java.io.FileWriter;

public class FileWriterPractise {

	public static void main(String[] args) {
		try {
			FileWriter j=new FileWriter("F:\\lot.txt",true);
			j.write(1);//int
			char[] j1= {'a','s','d'};
			j.write(j1);//char[]
			j.write("sai");//string
			j.flush();//flush
			j.close();//close()
			
		}catch(Exception e) {
			
		}

	}

}
