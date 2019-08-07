package com.primenumbers;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int i=1;
		int fact=1;
		while(i<=5) {
			
			fact=fact*i;
			System.out.println(fact);
			i++;
		}
		System.out.println(fact);

	}

}
