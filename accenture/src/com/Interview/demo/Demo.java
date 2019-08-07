package com.Interview.demo;

public class Demo {

	public static void main(String[] args) {
		
		int rem=0;
		int temp=0;
		int n=1234;
		while(n!=0) {
			rem=n%10;
			temp=(temp*10)+rem;
			n=n/10;
		}
		System.out.println(temp);
		String s="h";
		String[] k=s.split("");
	}
}
