package com.strings;

import java.util.Scanner;

public class ElseIfCondition {

	public static void main(String[] args) {
		Scanner d=new Scanner (System.in);
		System.out.println("marks");
		int a=d.nextInt();
		if(a<=35) {
			System.out.println("fail");
		}else if(a>=35 && a<=40){
			System.out.println("pass");
			
		}else {  
			System.out.println("ok");
		}

	}

}
