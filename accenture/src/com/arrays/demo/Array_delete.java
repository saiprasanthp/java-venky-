package com.arrays.demo;

public class Array_delete {

	public static void main(String[] args) {
		int[] k= {10,20,89,30,50};
		for(int i=0;i<k.length;i++) { 
			if(k[i]%2==0) {
				continue;
			}
			System.out.println(k[i]);
		}
	}
}
