package com.Wrapper.classes;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		//auto boxing
		int i=10;
		Integer obj=new Integer(i);
		System.out.println(obj);
		
		//auto unboxing
		Integer un=new Integer(10);
		int box=un.intValue();
		System.out.println(box);
		//.equals()
		if(obj.equals(box)) {
			System.out.println("hi");
		}
		
		//Number to String
		int m=100;
		Integer k=new Integer(10);
		String s=Integer.toString(m);
		System.out.println(s);
		
		//String to number
		String j="10";
		int l=Integer.parseInt(j);
		System.out.println(l);
	}

}
