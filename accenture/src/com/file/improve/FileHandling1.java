package com.file.improve;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.LineNumberReader;

public class FileHandling1 {
	
	public static void main(String[] args) {
		BufferedReader bf=null;
		FileInputStream f=null;
		LineNumberReader ln=null;
		try {
		bf=new BufferedReader(new FileReader("F:\\New Text Document (3).txt"));
		f=new FileInputStream("F:\\New Text Document (3).txt");
		ln=new LineNumberReader(bf);
		int i=ln.getLineNumber();
		String s=bf.readLine();
		while(s!=null && i<=3) {
			byte[] b=s.getBytes();
			String j=new String(b);
			boolean v=j.contains("born");
		System.out.println(j);
		System.out.println(i);
			s=bf.readLine();
			i++;
		}
		bf.close();
		f.close();
		}catch(Exception e) {
			
		}finally {
			try {
				bf.close();
				f.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
