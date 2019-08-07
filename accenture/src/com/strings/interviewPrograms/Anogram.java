package com.strings.interviewPrograms;

public class Anogram {

	public static void main(String[] args) {
		String name="morningn";
		int counter=1;
		int v=0;
		char[] k=name.toCharArray();
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
				if(k[i]==k[j]) {
					System.out.println(k[i]);
					
				}
			}
		}
		//System.out.println(v);
	}

}
