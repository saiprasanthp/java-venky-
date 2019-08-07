package com.constructor.test;
class Child22{
	Child22(){
		System.out.println("hai");
	}
	public String m2() {
		String s="sai";
		return s;
	}
	
}

public class ConstructorParent extends Child22{

	public static void main(String[] args) {
		ConstructorParent k=new ConstructorParent();
		String name=k.m2();
	
		

	}

}
