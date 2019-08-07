package com.Interface.implementation;
interface Hack{
	public abstract void m1();
}
interface Hack1{
	public abstract void m1(int i);
}
class Jet implements Hack,Hack1{
	public void m1() {
		System.out.println("only one method we should declare");
	}
	public void m1(int k) {
		System.out.println(k);
		System.out.println("only one method we should declare");
	}
}
public class InterafceDemo1 {

	public static void main(String[] args) {
		Jet h=new Jet();
		h.m1();
		h.m1(10);
		

	}

}
