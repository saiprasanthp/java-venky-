package com.file.improve;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		try
		{
		File f=new File("C:\\Program Files (x86)");
		String[] j=f.list();
		for(int i=0;i<j.length;i++) {
			System.out.println(j[i]);
		}
		}
		catch(Exception e)
		{
			
		}
	}

}
