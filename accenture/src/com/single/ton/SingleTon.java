  package com.single.ton;

public class SingleTon {
	private static SingleTon f=null;
	private SingleTon() {
		
	}
	public static SingleTon getSingleTon() {
		if(f==null) {
			f=new SingleTon();
		}return f;
	}
	public void m1() {
		System.out.println("hai");
	}

}
