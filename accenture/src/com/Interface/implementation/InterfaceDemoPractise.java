package com.Interface.implementation;

import java.io.FileReader;
import java.io.IOException;

interface It{
	 public abstract void help() throws Throwable;
	 public abstract void jk();
	 public abstract void kl();
}
 class Help implements It{
	 public void help() throws Exception{
		 FileReader g=new FileReader("F://jkl");
		 g.close();
	 }
	 public void jk() throws ArithmeticException {
		 System.out.println(100/0);
	 }
	 public void kl() {
		 
	 }
}

public class InterfaceDemoPractise {

	public static void main(String[] args) {
		Help g=new Help();
		try {
		g.help();
		}catch(Exception e) {
			e.printStackTrace();
		}
			try {
			g.jk();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}


