package com.Interface.implementation;
interface  L{
	public abstract void m1();
	
	
}
interface K{
	public abstract void m2();

	
}
abstract  class A1 implements L,K{
	public void m1() {
		
	}
	
	
}
class B1 extends A1{
	public void m2() {
		
		 
	}
}
class J implements L,K{
	public void m1() {
		
	}
	public void m2() {
		
	}
}
interface M extends L,K{
	public abstract void  m3();
}
class V implements M{
	public void m3() {
		
	}
	public void m1() {
		
	}
	public void m2() {
		
	}
}
class G{
	
}
class F extends G implements L,K
{
	public void m1() {
		
	}
	public void m2() {
		
	}
}

public class InterfaceDemo2 {
	public static  void main(String[] args) {
		
	}
	   
}
