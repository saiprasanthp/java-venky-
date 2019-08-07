package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileDemo4 {

	public static void main(String[] args) {
		try {
		BufferedReader g=new BufferedReader(new FileReader("F:\\123.txt.txt"));
		BufferedReader g1=new BufferedReader(new FileReader("F:\\filedemo.txt"));
		PrintWriter f=new PrintWriter("F:\\filedemo.txt");
		String s=g.readLine();
		String s1=g.readLine();
		while(s!=null) {
			f.write(s);
			while(s1!=null) {
				String h=g.readLine();
				if(h.equals(s1)) {
					f.write(h);
					g.readLine();
				}else {
				while(s!=null) {
					g.readLine();
				}	
				}
				g.close();
				g1.close();
				f.close();
			}
		}
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}

}
