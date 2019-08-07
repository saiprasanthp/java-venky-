package com.primenumbers;

public class palindrome {

	public static void main(String[] args) {
		int n=121;
		int h=n;
		int temp=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			temp=(temp*10)+rem;
			n=n/10;
		}
		System.out.println(temp);
		if(temp==h) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("not");
		}
	}
}