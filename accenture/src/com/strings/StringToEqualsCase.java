package com.strings;

import java.util.Scanner;

public class StringToEqualsCase {

	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("enter name");
		String s=f.next();
		String s1="manoj";
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("hai");
		}else {
			System.out.println("jji");
		}
		f.close();
		

	}

}
