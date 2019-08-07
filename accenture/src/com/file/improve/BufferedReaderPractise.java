package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderPractise {

	public static void main(String[] args) {
		try {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document.txt"));
		String s=bf.readLine(); //readLine is used to take the complete line in the file -----string
		while(s!=null) {//if line are over it returns null
			System.out.println(s);
			s=bf.readLine();
		}
		bf.close();
		}catch(Exception e) {
			
		}

	}

}
