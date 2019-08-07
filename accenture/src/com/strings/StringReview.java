package com.strings;

public class StringReview {

	public static void main(String[] args) {
		String s="saikishore";
		String s1=new String("sai");
		System.out.println(s.equals(s1));
		for(int i=0;i<s.length();i++) {

			if(i%2!=0) {
				s.charAt(i);
				continue;

			}else {
				char c=s.charAt(i);
				System.out.println(c);
			}
		}
		int k=s.indexOf("h");
		String m=s.toString();
		System.out.println(m);
		System.out.println(k);
		if(k==6) {
			char n=s.charAt(k);
			System.out.println(n);
		}
	}

}
