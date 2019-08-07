package com.Interface.implementation;
interface Class{
	int k=100;
	public abstract void implement();
	public abstract void imp();
	
}
abstract class Develop implements Class{
	public void implement() {
		System.out.println("this is the implementation of an abstract method");
	}
	
} class Devp1 extends Develop{
	int k=9;
	public void imp() {
		System.out.println("this is the total implementation of a interface");
	}
}
public class InterfacesDemo {

	public static void main(String[] args) {
		Devp1 g=new Devp1();
		g.implement();
		g.imp();
	}

}
