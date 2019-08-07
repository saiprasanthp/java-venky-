package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FilesPrint {

	public static void main(String[] args) {
		try {
		BufferedReader f=new BufferedReader(new FileReader("F:\\k.txt.txt"));
		BufferedReader j=new BufferedReader(new FileReader("F:\\jeep.txt"));

		PrintWriter h=new PrintWriter("F:\\kis.txt");
		String s=f.readLine();
		String s1=j.readLine();
		while(s!=null||s1!=null) {
			if(s.equals(s1)) {
				s=f.readLine();
				continue;
			}else {
			h.println(s);
			h.println(s1);
			
			s=f.readLine();
			s1=f.readLine();
			}	
		}
		f.close();
		h.close();
		j.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
