package com.map.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

//map program
public class TreeMapExamplesDemo {
	public static TreeMap<Integer,String> m1() {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		String[] g=new String[100];
		try {
		BufferedReader in=new BufferedReader(new FileReader("F:\\New Text Document (22).txt"));
		String first=in.readLine();
		int i=0;
		int j=i+1;
		while(first!=null) {
			g=first.split(",");
			String num=g[i];
			int num1=Integer.parseInt(num);
			Integer num2=new Integer(num1);
			map.put(num2, g[j]);
			first=in.readLine();	
		}
			in.close();	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return map;
		
	}
	
	public static void m2(TreeMap<Integer,String> map1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(map1.containsKey(num)) {
			String value=map1.get(num);
			System.out.println(value);
		}else {
System.out.println("invalid ");
		}
		sc.close();
	}

	public static void main(String[] args) {
		TreeMap<Integer,String> map1=m1();
		m2(map1);
	}
}
