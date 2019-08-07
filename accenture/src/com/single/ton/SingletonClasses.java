package com.single.ton;

public class SingletonClasses {
	private static  SingletonClasses f=null;
	private SingletonClasses() {
		
	}
	public static SingletonClasses getInstance() {
		if(f==null) {
			f=new SingletonClasses();
		}
		return f;
	}

	public static void main(String[] args) {
		SingletonClasses d=SingletonClasses.getInstance();
		System.out.println(d);
		SingletonClasses d1=SingletonClasses.getInstance();
		System.out.println(d1);

		
		

	}

}
