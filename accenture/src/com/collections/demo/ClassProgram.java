package com.collections.demo;
import java.util.*;

public class ClassProgram {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=0;i<=100;i++) {
			if(i<=10) {
				sum=sum+i;
			}
			else if(i>=11 && i<20) {
				sum1=sum1+i;
			}
			
		}
		System.out.println(sum1);
	}

}
