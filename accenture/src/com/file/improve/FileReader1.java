package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args) {
		try {
		BufferedReader h=new BufferedReader(new FileReader("F:\\abc11.txt"));   
		String s=h.readLine();
		/*StringBuffer f=new StringBuffer(s);
		while(f!=null) {
			System.out.println(f.reverse());	
		}*/
		for(int i=s.length();i>0;i--) {
			System.out.print(s.charAt(i-1));
		}
		h.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
