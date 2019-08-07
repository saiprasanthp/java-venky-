package com.strings;

//making String 2nd letter into Capital letter
public class StringsAlphabet {

	public static void main(String[] args) {
		String name="hello";
		for(int i=0;i<name.length();i++) {
			if(i%2==0) {
				System.out.println(name.charAt(i));
			}else {
				char c=name.charAt(i);
				char j=Character.toUpperCase(c);
				System.out.println(j); 
			}
		}
	}
}
