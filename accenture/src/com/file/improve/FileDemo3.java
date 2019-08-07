package com.file.improve;

import java.io.File;
import java.io.FileWriter;

public class FileDemo3 {

	public static void main(String[] args) {
		try {
			File g=new File("F:\\abc.txt");
		FileWriter d=new FileWriter(g);
		d.write("2920022020");
		d.write('d');
		System.out.println("written");
		d.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
