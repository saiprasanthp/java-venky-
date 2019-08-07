package com.strings;

public class Capital {

	public static void main(String[] args) throws RuntimeException{
		String s="sai";
		String s1=s.toUpperCase();
		System.out.println(s1);
		for(int i=0;i<s.length();i++) {
			if(i==0) {
			char c=s.charAt(i);
			char g=Character.toUpperCase(c);
			System.out.println(g);
			//break;
			}
			System.out.println(s.charAt(i));	
		}
	}

}
