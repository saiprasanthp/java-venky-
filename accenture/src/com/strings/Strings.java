package com.strings;
interface i{
	public static final int x=100;
	public abstract void free();
}
class V implements i{
	int x=100;
	void m1() {
		System.out.println(x);
	}
	public void free() {
		System.out.println("haiii");
	}
}
public class Strings {
	
	public static void main(String[] args) {
		String s="hello";
		System.out.println(s.length());
		
		if(s.contains("l")) {
			System.out.println("correct");
		}
		char[] c=s.toCharArray();
		   
		for(char k:c) {
			System.out.println(k);
		}	
	}
}
	



