package com.collections.demo;
import java.util.*;

public class InterfaceObject {

	public static void main(String[] args) {
		ArrayList<String> k=new ArrayList<String>();
		k.add("s");
		List<String> k1=new ArrayList<String>(k);
		System.out.println(k1);
	}

}
