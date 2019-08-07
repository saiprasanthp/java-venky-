package com.constructor.test;

public class Constructors1 {
	int i;
	Constructors1(int i){
		this(10,20);
		this.i=i;
		
	}
	Constructors1(int i,int z){
		System.out.println(i);
		System.out.println(z);
	}

	public static void main(String[] args) {
		Constructors1 k=new Constructors1(10);
		
		
		
	}

}
