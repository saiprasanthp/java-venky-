package com.collections.demo;

import java.util.Scanner;

public class PrimeRNot {

	public static void main(String[] args) {
		
		Scanner f=new Scanner(System.in);
		System.out.println("enter number");
		int number=f.nextInt();
		if(number<0) {
			System.out.println("number must be greater than 1");
		}else {
			boolean flag=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				flag=false;
				
			}
		}
			if(flag) {
				System.out.println("prime no");
			}else {
				System.out.println("not prime");
			}
		
		
		

	}

}
}
