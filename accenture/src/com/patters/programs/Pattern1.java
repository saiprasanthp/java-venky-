package com.patters.programs;
//pattern examples
public class Pattern1 {

	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			for(int j=1;j>=1;j++) {
				for(int k=1;k<j;k++) {
					System.out.print(k+" ");
				}
				System.out.println(j+" ");
			}
			System.out.println();
		}
		

	}

}
