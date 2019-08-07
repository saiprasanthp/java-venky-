package com.strings.interviewPrograms;

public class StringsEliminateSpaces {

	public static void main(String[] args) {
		
		String name="arrays is arrays";
	char[] n=	name.toCharArray();
	for(int i=0;i<n.length;i++) {
		if(n[i]==' ') {
			continue;
			
		}
		System.out.print(n[i]);
	}
	}
}
