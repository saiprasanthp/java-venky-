package com.arrays.demo;

public class Array_value_max_min {

	public static void main(String[] args) {
		int[] m= {10,30,50,90};
		int max=m[0];
		int min=m[0];
		for(int i=1;i<m.length;i++) {
			if(m[i]>max) {
				max=m[i];
			}else if(m[i]<min){
				min=m[i];
				
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
