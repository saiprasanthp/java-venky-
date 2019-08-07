package com.file.improve;
import java.io.*;
import java.util.Scanner;
class NoRecord extends RuntimeException{
	String s;
	NoRecord(String s){
		this.s=s;
	}
	 
}
public class FilesPractiseOwn {
	public void fileDetails() throws IOException{
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (12).txt"));
		String new1=bf.readLine();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin details");
		String pin=sc.next();
		while(new1!=null) {
			if(pin.equals(new1)) {
				System.out.println("for deposite enter 1");
				System.out.println("for balance enter 2");
				Scanner f=new Scanner(System.in);
				String k=f.next();
				f.close();
				if(k.equals("1")||k.equals("2")) {
				switch(k) {
				case "1":
					System.out.println("amount=123");
					break;
				case "2":
					System.out.println("currentbalance =1220");
					break;
					default:
						throw new NoRecord("found");
				}break;
				}else {
					
					throw new NoRecord("found");
				
			}
			}
			new1=bf.readLine();
			
		}bf.close();
		sc.close();
		if(new1==null) {
			throw new NoRecord("found");
		}
		
	}

	public static void main(String[] args) {
		FilesPractiseOwn h=new FilesPractiseOwn();
		try {
		h.fileDetails();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
