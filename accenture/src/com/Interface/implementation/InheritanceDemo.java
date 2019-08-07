package com.Interface.implementation;

import java.util.Scanner;

interface Intern {
	public abstract void fromAddress();

}
class Adaptor implements Intern{
	public void fromAddress() {

	}
}
class Range extends Adaptor{
	public void fromAddress() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter from location");
		String name=sc.next();
		this.takeToAddress(name);
		sc.close();	
	}
	public void takeToAddress(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter toAddress");
		String to=sc.next();
		this.m3(name,to);
		sc.close();	
	}
	public void m3(String from,String to) {
		String combined=from.concat(to);
		String validate="nellorehyderabad";
		if(combined.equalsIgnoreCase(validate)) {
			switch(combined) {
			case "nellorehyderabad":
				System.out.println("11:25am");
				System.out.println("12:00am");
				break;
			}
		}
		else 
		{
			System.out.println("no busses found");
		}
	}	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Intern rang=new Range();
		rang.fromAddress();
	}
}

