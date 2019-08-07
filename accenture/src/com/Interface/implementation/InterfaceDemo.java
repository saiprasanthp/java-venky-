package com.Interface.implementation;

import java.io.FileWriter;
import java.util.Scanner;

interface Al{
	public static final int a=10;
	public abstract void m1();
	
}class H implements Al{
	public void m1() {
		try {
		Scanner s=new Scanner(System.in);
		FileWriter g=new FileWriter("F:\\abc.txt",true);
		g.write("username:sai"+"pswd:1122");
		//g.write("manu");
		//s.close();
		g.close();
		System.out.println("enter name");
		String A=s.next();
		//String A = "stackOverflow";
		/*String caps=A.toUpperCase().charAt(0)+A.substring(1, A.length());
		System.out.println(caps);
		*/
		String name=Character.toUpperCase(A.charAt(0))+A.substring(1, A.length());
		System.out.println(name);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		H d=new H();
		d.m1();

	}

}
