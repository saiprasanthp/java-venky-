package com.Interface.implementation;
abstract class Parent1{
	Parent1(){
		System.out.println("hello");
	}
	abstract public void details();
	abstract public void details1();
	abstract public void details2();
	abstract public void details3();
}
abstract class Child3 extends Parent{
	public void details() {
		System.out.println("this is the abstraction");
	}
	public void details1() {
		this.details();
	}
}
class Child2 extends Child3{
	 public void details2() {
		 super.details1();
	 }
	 public void details3() {
		 this.details2();
	 }

}
public class AbstractionClass {

	public static void main(String[] args) {
		Child2 h=new Child2();
		h.details3();
	}
}
