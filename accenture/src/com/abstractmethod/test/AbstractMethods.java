package com.abstractmethod.test;
interface I{
	public abstract void m1();
}
class M implements I{

	public void m1() {
		
	}
	
}
abstract class O{
	public abstract void m2();
	int i;
	O(int i){
		this.i=10;
		
	}
}
class K extends O{
	
	K(int i) {
		super(i);
	}

	public void m2() {
		
	}
}


public class AbstractMethods {

	public static void main(String[] args) {
		

	}

}
