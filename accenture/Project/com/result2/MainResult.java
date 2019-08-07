package com.result2;

import java.util.Scanner;
import java.util.TreeMap;

import com.result1.StudentDetails;

public class MainResult {

	public static void main(String[] args) {
		StudentDetails h1=new StudentDetails("sai","11/12/1996");
		StudentDetails h2=new StudentDetails("manu","15/12/1996");
		StudentDetails h3=new StudentDetails("kishore","11/12/1996");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		TreeMap<String,Object> f=new TreeMap<String,Object>();
		f.put("122u1a04a7", h1);
		f.put("122u1a0499", h2);
		f.put("122u1a0492", h3);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hallticket number");
		String hall=sc.next();
		if(f.containsKey(hall)) {
			Object c=f.get(hall);
			System.out.println(c);
		}else {
			System.out.println("no result");
		}
		/*
		 * 		//Set<String> keys=f.keySet();

		 * 		//Iterator<String> it=keys.iteator();

                 while(it.hasNext()) {
			String hall1=it.next();
			if(hall.equalsIgnoreCase(hall1)) {
				Object o=f.get(hall);
				System.out.println(o);
				break;
			}
			if(it.hasNext()==false) {
				System.out.println("no student found");
			}
		}*/

		sc.close();
	}
}
