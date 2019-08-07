package com.strings;

public class StringToUpper {

	public static void main(String[] args) {
		String s="sai";
		String letter=" ";
		for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 if(i%2==0) {
				char c= Character.toUpperCase(ch);
				 letter = letter+c;
			 }else {
				 System.out.println(ch);
			 }
			 System.out.println(ch);	 
		}
	}
}
