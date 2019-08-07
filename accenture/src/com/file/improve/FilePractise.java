package com.file.improve;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FilePractise {
	public static void main(String[] args) {
		String[] g=new String[1];
		int i=0;
		try {
		File d=new File("F:\\","d");
		if(!d.mkdir()) {
			d.mkdir();
			System.out.println("directory is successsfully completed");
		}
		FileWriter f=new FileWriter("F:\\d\\text.txt");
		f.write("armed forces Wednesday updated Prime Minister Narendra Modi  .. \r\n" + 
				"\r\n" + 
				"Read more at:\r\n" + 
				"http://timesofindia.indiatimes.com/articleshow/68190278.cms?utm_source=contentofinterest&utm_medium=text&utm_campaign=cppst");
		System.out.println("10 is writen in the file");
		f.close();
		File p=new File("F:\\d\\text.txt");
		Scanner sc=new Scanner(p);
		while(sc.hasNextLine()) {
			 g[i]=sc.nextLine();		
		}
		for(String k:g) {
			System.out.println(k);
		}
		sc.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
