package com.file.improve;
import java.io.File;

public class FilePractise1 {

	public static void main(String[] args) {
		try {
		File h=new File("F:\\practise.txt");
		if(!h.exists()) {
			h.createNewFile();
			System.out.println("file is created and it is ready to use");
		}
		System.out.println(h.length());
		File h1=new File("F:\\","jalsa");
		h1.mkdir();
		File h3=new File(h1,"jalsa.txt");
		h3.createNewFile();
		System.out.println(h3.length());
		//list() return String[]
		File h5=new File("F:\\");
		String[] j=h5.list();
		for(String k:j) {
			System.out.println(k);
		}
		//listFiles() returns file[]
		File[] l=h5.listFiles();
		for(File k:l) {
			System.out.println(k);
		}
		}catch(Exception e) {
			
		}
	}
}
