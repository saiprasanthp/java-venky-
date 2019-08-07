package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterPractise {

	public static void main(String[] args) {
		try {
			PrintWriter p=new PrintWriter("F:\\magadeera.txt");
			BufferedReader k=new BufferedReader(new FileReader("F:\\New Text Document.txt"));
			FileWriter m=new FileWriter("F:\\miss.txt");
			m.write("sai");
			m.close();
			BufferedReader k1=new BufferedReader(new FileReader("F:\\miss.txt"));
			String s=k.readLine();
			String s1=k1.readLine();
			while(s!=null||s1!=null) {
				p.println(s);
				p.println(s1);
				s=k.readLine();
				//s1=k1.readLine();
			}
			p.close();
			k.close();
			//m.close();
			k1.close(); 
 
		}catch(Exception e) {

		}

	}

}
