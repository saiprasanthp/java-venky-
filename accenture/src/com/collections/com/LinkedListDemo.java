package com.collections.com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add("manu");
		ll.add("sri");
		if(ll.contains("sai")) {
			System.out.println("hai");
		}else {
			System.out.println("no object");
		}
	}

}
