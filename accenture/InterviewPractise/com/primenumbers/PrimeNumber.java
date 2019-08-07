package com.primenumbers;
//prime number 1-100
public class PrimeNumber {

	public static void main(String[] args) {
		int n=100;
		for(int i=2;i<=n;i++) {
			int counter=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					counter++;
				}
			}
			if(counter==0) {
				System.out.println(i);
			}
		}
		int temp=0;
		for(int i=2;i<=n-1;i++) {
			 //temp=0;
			if(n%i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("prime number");
		}
	}
}
