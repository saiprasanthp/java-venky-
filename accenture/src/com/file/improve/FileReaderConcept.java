package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileReaderConcept {

	public static void main(String[] args) {
		try {
			BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (8).txt"));
			BufferedReader bf1=new BufferedReader(new FileReader("F:\\New Text Document (9).txt"));
			LineNumberReader ln=new LineNumberReader(bf1);
			Scanner f=new Scanner(System.in);
			System.out.println("enter number");
			String num=f.next();
			String s=bf.readLine();
			String s1=bf1.readLine();
			int a=ln.getLineNumber();

			while(s!=null)
			{
				if(num.equals(s))
				{
					while(s1!=null)
					{
						if(s.equals(s1))
						{
							System.out.println("linenumber"+a);
							break;

						}
						else 
						{
							s1=bf1.readLine();
							a++;

						}
					}
				}
				else 
				{
					s=bf.readLine();
				} 
				if(s==null) {
					throw new Exception("not found");
				}
			}bf.close();
			bf1.close();
			ln.close();
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}


	}
	

}
