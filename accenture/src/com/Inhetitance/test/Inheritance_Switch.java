package com.Inhetitance.test;

import java.util.Scanner;
class Change{
	public void m1() {
		System.out.println("name and age");
	}	
}
class SwitchCase{
	Change h;
	
	SwitchCase(Change h){
		this.h=h;
	}
	public void switchCase() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String s=sc.next();
		if(s.equals("sai")) {
			switch(s) {
			case "sai":
				System.out.println("sai");
				h.m1();
				break;
				default:
					System.out.println("not correct");
					break;		
			}
			
		}else {
				System.out.println("not found");
			
			
		}sc.close();
	}
	
}

public class Inheritance_Switch {

	public static void main(String[] args) {
		Change h=new Change();
		SwitchCase j=new SwitchCase(h);
		j.switchCase();
	}

}
