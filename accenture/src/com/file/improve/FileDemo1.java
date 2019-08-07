package com.file.improve;
//file demo 

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		File dir=new File("C:\\");
		File[] file=dir.listFiles();
		for(File g:file) {
			System.out.println(g);
		
		}
		System.out.println("can write "+dir.canWrite());		
		

	}

}
