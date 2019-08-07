package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileConcept1 {

	public static void main(String[] args) {
		LineNumberReader ln =null;
		BufferedReader bf=null;
		try {
			bf=new BufferedReader(new FileReader("F:\\New Text Document (10).txt"));
			 ln=new LineNumberReader(bf);
			
			Scanner f=new Scanner(System.in);
			System.out.println("enter element");
			String search=f.next();
			String s=bf.readLine();
			int linenumber=0;
			while(s!=null) {
				boolean b=s.contains(search);
				if(b) {
					int i=s.lastIndexOf(search);
					System.out.println(i);
					System.out.println(linenumber);	
					break;  
				}
					s=bf.readLine();
					linenumber++;
			
				if(s==null) {
					throw new Exception("no such String found");
				}
			}
			f.close();
			ln.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ln.close();
				bf.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
