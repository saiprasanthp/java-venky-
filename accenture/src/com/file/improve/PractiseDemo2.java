package com.file.improve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PractiseDemo2 {
	public char[] m1() {
		File g=new File("F:\\abc.txt");
		char[] c=new char[(int)g.length()];
		int i;

		try {
			BufferedReader f=new BufferedReader(new FileReader(g));
			while((i=f.read())!=-1){
				System.out.print((char)i);

			}
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}return c;

	}
	

	public static void main(String[] args) {
		PractiseDemo2 h=new PractiseDemo2();
		char[] l=h.m1();
		System.out.println(l);
		

}
}
