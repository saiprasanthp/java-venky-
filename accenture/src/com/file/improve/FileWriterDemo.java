package com.file.improve;

import java.io.File;
import java.io.FileWriter;

//FileWriterDemo
public class FileWriterDemo {

	public static void main(String[] args) {
		try
		{
		File f=new File("F:\\filedemo.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("sai");
		
		fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
