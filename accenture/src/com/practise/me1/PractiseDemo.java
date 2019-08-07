package com.practise.me1;

import com.practise.me.Inheritance;

public class PractiseDemo {

	public static void main(String[] args) {
		Inheritance in=new Inheritance();
		in.m1(10);
		String[] user=in.array();
		boolean result=in.myData(user);
		if(result==true) {
			System.out.println("good");
		}else {
			System.out.println("last session");
		}
		

	}

}
