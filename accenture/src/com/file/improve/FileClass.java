package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileClass {

	public static void main(String[] args) {
		BufferedReader bf=null;
		BufferedReader bf1=null;
		try {
			bf=new BufferedReader(new FileReader("F:\\New Text Document (6).txt"));
			bf1=new BufferedReader(new FileReader("F:\\New Text Document (7).txt"));
			String s=bf.readLine();
			String s1=bf1.readLine();
			Scanner d=new Scanner(System.in);
 			System.out.println("enter pnrdetails");
			String PNRDetails=d.next();
			String [] j=new String[10];
				while(s!=null) {
					j=s.split(":");
					if(PNRDetails.equals(j[1])) {
						System.out.println(s1);
						break;	
					}
					s=bf.readLine();
					s1=bf1.readLine();
					if(s==null) {
						throw new Exception("pnr not found");
					}
					d.close();
			}


		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
				bf1.close();


			}catch(Exception e) {

			}
		}

	}

}
