package com.ExceptionHanding;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHnadling2 {
	public void print() throws Exception {
		BufferedReader bf=new BufferedReader(new FileReader("F:\\ktr.txt"));
	}

	public static void main(String[] args) {
		ExceptionHnadling2 h=new ExceptionHnadling2();
		try {
		h.print();
		}catch(Exception e) {
			System.out.println("if it is not there catchblock will execute");
		}
		
	}

}
