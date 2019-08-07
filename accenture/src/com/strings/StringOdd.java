package com.strings;

public class StringOdd {

	public static void main(String[] args) {
		String s="HELLO";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i));
			}else {
				char c=s.charAt(i);
				char h=Character.toLowerCase(c);
				System.out.println(h);
				//System.out.println("odd"+i);
			}
		}

	}

}
