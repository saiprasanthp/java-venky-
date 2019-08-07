package com.strings;
//string split method

public class SplitMethod {

	public static void main(String[] args) {
		int i;
		String s="this is my lap,and this is his lap"
				+ "this is my lap,and this is his lap";
		String[] m=new String[s.length()];
		 m=s.split(",");
		System.out.println(m.length);
		for( i=0;i<m.length;i++) {
			System.out.println(m[i]);	
		}if(m[1].contains("and")) {
			System.out.println("hi");
		}
		System.out.println(i);
	}
}
