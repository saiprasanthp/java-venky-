package com.file.improve;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileOutputStream1 {

	public static void main(String[] args) {
		try {
			
			
		/*FileOutputStream f=new FileOutputStream("F:\\gang.txt");
		String s="sai";
		byte[] b=s.getBytes();
		f.write(b);
		
		
		f.close();*/
			/*FileReader h=new FileReader("F:\\gang.txt");
			int i=h.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=h.read();
			}*/
			PrintWriter k=new PrintWriter("F:\\gang1.txt");  
			BufferedReader b=new BufferedReader(new FileReader("F:\\gang.txt"));
			String s=b.readLine();
			StringBuffer j=new StringBuffer(s);
			while(j!=null) {
				System.out.println((j.reverse()));
				break;
				//j=b.readLine();
			}
			b.close();
			k.close();
			
		}catch(Exception e) {
			
			
		}

	}

}
