package com.venky.ubereats;
import java.util.Scanner;

import com.getters.setters.*;


public class CodeFinal extends GettersSetters{
	public void validate() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter item");
		String name=sc.next();
		String bir=new String("DUMBIRYANI");
		boolean b=name.equalsIgnoreCase(bir);
		if(b) {
		switch(name) {
		case "dumbiryani":
			double biryani=100;
			Scanner dc=new Scanner(System.in);
			System.out.println("enter promocode");
			String havepromo=dc.next();
			if(getPromocode().equals(havepromo)) {
				double cash=biryani/2;
				System.out.println(cash);	
			}else {
				throw new Exception("invalid promo");
			}
			break;
		 case "DUMBIRYANI":
			double biryani1=100;
			Scanner dc1=new Scanner(System.in);
			System.out.println("enter promocode");
			String havepromo1=dc1.next();
			if(getPromocode().equals(havepromo1)) {
				double cash=biryani1/2;
				System.out.println(cash);	
			}else {
				throw new Exception("invalid promo");
			}
			break;
		}
		}else {
			sc.close();
			throw new Exception("no items found");
		}	
	}
}
