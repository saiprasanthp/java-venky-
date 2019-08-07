package com.arrays.demo;

public class ArraysDecending {
	public void m1(int[] k) {
		int temp;
		for(int i=0;i<k.length;i++) {
			for(int l=i+1;l<k.length;l++) {
				if(k[i]<k[l]) {
					temp=k[i];
					k[i]=k[l];
					k[l]=temp;		
				}
			}
		}
		for(int i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}	
	}
	public static void main(String[] args) {
		int[] k= {40,10,60,50};
		ArraysDecending j=new ArraysDecending();
		j.m1(k);
	}
}
