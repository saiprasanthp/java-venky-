package com.strings;

public class StringFirstLetterUpper {

	public static void main(String[] args) {
		String s="hello this is vijay kilo";
		String[] h=s.split("\\s");
		String[] k=new String[h.length];
		for(int i=0;i<h.length;i++) {
			k[i]=h[i];
		}
		for(int i=0;i<k.length;i++) {
			
			char c=k[i].charAt(0);
			String j=k[i].substring(1);
			char v=Character.toUpperCase(c);
			System.out.print(v+j+" ");  
		}

	}
}
