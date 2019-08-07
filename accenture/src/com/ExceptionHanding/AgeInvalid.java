package com.ExceptionHanding;

import java.io.IOException;

import java.util.Scanner;

public class AgeInvalid extends RuntimeException{
	public void valid() throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int age=s.nextInt();
		if(age>18 && age<=120 ) {
			System.out.println("he is eligable for voting");
		}else {
			throw new IOException();
		}	
	}
	public static void main(String[] args) {
		AgeInvalid j=new AgeInvalid();
		try {
		j.valid();
		}catch(Exception e) {
			throw new AgeInvalid();
		}
	}
}
