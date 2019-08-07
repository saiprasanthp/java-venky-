package com.strings.interviewPrograms;

public class RemoveStringSpace {

	public static void main(String[] args) {
		String name="hello world";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				continue;
			}
			System.out.print(name.charAt(i));
		}
	}
}
