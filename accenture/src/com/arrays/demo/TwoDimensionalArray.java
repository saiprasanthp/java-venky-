package com.arrays.demo;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] k=new int[2][];
		k[0]=new int[3];
		k[1]=new int[3];
		k[0][0]=10;
		k[0][1]=20;
		k[0][2]=30;
		k[1][0]=20;
		k[1][1]=40;
		k[1][2]=60;
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<=k.length;j++) {
				System.out.println(k[i][j]);
			}
		}

	}

}
