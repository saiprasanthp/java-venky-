package com.strings.interviewPrograms;

public class Reverse_String {

	public static void main(String[] args) {
		String name="javatpoint";
		for(int i=name.length();i>0;i--) {
			System.out.print(name.charAt(i-1));	
		}
		
		
		for(int j=name.length()-1;j>=0;j--) {
			System.out.println(name.charAt(j));
		}
		
		
	}
}
