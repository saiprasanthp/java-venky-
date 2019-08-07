package com.file.improve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PractiseFileDemo {
	public String bufferedReader() {
		String s = null;
		try {
		BufferedReader f=new BufferedReader(new FileReader("F:\\New Text Document (3).txt"));
		 s=f.readLine();
		while(s!=null) {
			System.out.println(s);
			s=f.readLine();
		}
		f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	public String bufferedReader1() {
		String h=null;
		try {
			BufferedReader g=new BufferedReader(new FileReader("F:\\manu.txt"));
			h=g.readLine();
			while(h!=null) {
				System.out.println(h);
				h=g.readLine();
			}
			g.close();	
		}catch(Exception e) {
			e.printStackTrace();
		}return h;
	}
	public void bufferedWriter(String seq,String heq) {
		try {
			BufferedWriter f=new BufferedWriter(new FileWriter("F:\\abc1.txt"));
			f.write(seq);
			f.newLine();
			f.write(heq);
			f.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		PractiseFileDemo f=new PractiseFileDemo();
		String seq=f.bufferedReader();
		System.out.println(seq);
		String heq=f.bufferedReader1();
		System.out.println(heq);
		f.bufferedWriter(seq,heq);
	}

}



