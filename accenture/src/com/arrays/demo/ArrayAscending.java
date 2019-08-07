package com.arrays.demo;


public class ArrayAscending {
	int[] j=new int[10];
	int temp;
	public void m1(int[] l) {
		for(int i=0;i<l.length;i++) {
			for(int j=i+1;j<l.length;j++) {
				if(l[i]>l[j]) {
					
					temp=l[i];
					l[i]=l[j];
					l[j]=temp;
				}
			}
		}
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]); 
		}
	}
	public static void main(String[] args) {
		int[] a= {10,30,50,80,40};
		ArrayAscending h=new ArrayAscending();  
		h.m1(a);
	}
}