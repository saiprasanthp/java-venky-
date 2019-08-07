package com.strings;

import java.util.Scanner;
class Invalid extends RuntimeException{
	String s;
	Invalid(String s){
		this.s=s;
	}
	
}
public class UserName {
	String[] k=new String[2];
	public String[] check() {
		Scanner d=new Scanner(System.in);
		System.out.println("enter username");
		String name=d.next();
		System.out.println("enter password");
		String pwd=d.next();
		k[0]=name;
		k[1]=pwd;
		return k;
		
	}
	public void hadDetails(String[] takenDetails) {
		String k="manoj";
		if(takenDetails[0].equals(k)&&(takenDetails[1].equals("1234"))) {
			System.out.println("information is correct");
		}
		else {
			throw new Invalid("user details");
		}
	}

	public static void main(String[] args) {
		UserName j=new UserName();
		String[] takenDetails=j.check();
		j.hadDetails(takenDetails);
		
		

	}

}
