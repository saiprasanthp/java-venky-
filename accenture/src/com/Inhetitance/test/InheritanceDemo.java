package com.Inhetitance.test;
class Animal{
	public void bark(int i) throws Exception {
		
		System.out.println("hello");
	}
	
}
class Dog extends Animal{
	public void bark(int i) throws Exception {
		
		System.out.println("hai");
		System.out.println(100/0);
	}
	public void take() {
		
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) { 
		Dog h=new Dog(); 
		try {
		h.bark(10);
		}catch(Exception e) {
			
		}
		
		h.take();
	
		
	}

}
