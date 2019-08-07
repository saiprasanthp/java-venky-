package com.collections.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractise {

	public static void main(String[] args) {
		BufferedReader bf=null;
		try {
		bf=new BufferedReader(new FileReader("F:\\New Text Document (9).txt"));
		String s=bf.readLine();
		ArrayList<String> al=new ArrayList<String>();
		while(s!=null) {
			al.add(s);
			s=bf.readLine();
			
		}
		Iterator<String> it=al.iterator();
		boolean j=it.hasNext();
		while(j) {
			String k=it.next();
			System.out.println(k);
			if(k.equals("1")) {
				System.out.println("1 is there");
				break;
			}
			j=it.hasNext();
		}bf.close();
		if(j==false) {
			throw new Exception("line is completed");
		}
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
