package com.Interface.implementation;
class ParentClass{
	final public void m4() {
		
	}
	private void m1() {
		System.out.println("hello");
	}
}
class ChildClass extends ParentClass{
	private void m2() {
		System.out.println("hai");
	}
	public void m3() throws Exception{
		this.m2();
		System.out.println(100/0);
	}
}


public class Overriding {

	public static void main(String[] args) {
		ChildClass f=new ChildClass();
		try {
		f.m3();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

