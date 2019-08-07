package com.practise.me;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

interface Jet{
	public abstract void take() throws Exception;
	
}
class Set{
	public String name1;
	public void setName1(String name1) {
		this.name1=name1;
	}
	public String getName1() {
		return name1;
	}
	
}
class Setters1 extends Set implements Jet{
	public void take() throws Exception {
		Scanner c=new Scanner(System.in);
		System.out.println("enter name");
		String name=c.next();
		 super.setName1(name);
		 BufferedReader bg=new BufferedReader(new FileReader("F:\\New Text Document (12).txt"));
		 String s=bg.readLine();
		 while(s!=null) {
			 
		 if(getName1().equals(s)) {
			 System.out.println("jo");
			 break;
		 }
		 s=bg.readLine();
		 if(s==null) {
			 throw new Exception("invalid entry");
		 }
		 }bg.close(); 
		 c.close();
		 
		
	}
}

public class SettersGetters {

	public static void main(String[] args) {
		Jet j=new Setters1();
		try {
		j.take();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
