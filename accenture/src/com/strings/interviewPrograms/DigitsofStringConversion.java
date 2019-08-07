package com.strings.interviewPrograms;

public class DigitsofStringConversion {

	public static void main(String[] args) {
		String name="sai23";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			Character mm=new Character(c);
			if(mm.isDigit(c)) {
				System.out.println(c);
			}
			
		}

	}

}
