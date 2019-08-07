package com.strings;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		String[] k=m1();
		for(String l:k) {
			System.out.println(l);
		}
	}

public static String[] m1() {
		String[] g=new String[14];
		int i=0;
		try {
		Path path=Paths.get("F:\\New Text Document (3).txt");
		Scanner f=new Scanner (path);
		while(f.hasNextLine()) {
			g[i]=f.nextLine();
			System.out.println(g[i]);
			i++;	
		}
		f.close();
		}catch(Exception e) {
			
		}
		return g;
		
	}

}
