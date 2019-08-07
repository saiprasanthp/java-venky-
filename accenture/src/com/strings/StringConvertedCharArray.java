package com.strings;
class Convert {
	public char[] valid() {
		String s="hello world";
		//char[] j=new char[20];
	/*	for(int i=0;i<s.length();i--) {
			j[i]=s.charAt((s.length()-1)-i);
		}*/
		char[] j=s.toCharArray();
		char[] k=new char[j.length];
		for(int i=0;i<j.length;i++) {
			k[i]=j[j.length-1-i];
		}
		return k;
	}
}

public class StringConvertedCharArray {

	public static void main(String[] args) {
		Convert h=new Convert();
		char[] k=h.valid();
		for(char l:k) {
			System.out.print(l);
		}
	}

}
