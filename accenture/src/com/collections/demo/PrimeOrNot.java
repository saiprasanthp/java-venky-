package com.collections.demo;

public class PrimeOrNot {

	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=100;i++) {
			count =0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}   
			}
			if(count==1) {
				System.out.println(i);
			}
		}

	}

}
