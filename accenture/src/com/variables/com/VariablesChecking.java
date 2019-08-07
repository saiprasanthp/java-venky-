package com.variables.com;

import com.variables2.com.Variables2;

public class VariablesChecking extends Variables2 {
	public static int kk=90;
	public int m=20;
	public  void m2() {
		int k=30;
		if(m==30) {
			
		}
		super.m4(this);
		System.out.println(k);
	}
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		System.out.println(kk);
		VariablesChecking mmm=new VariablesChecking();
		mmm.m2();
		m1();
	}
	public static void m1() {
		int i=20;
		System.out.println(i);
	}
}
