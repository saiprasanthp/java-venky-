package com.collections.demo;
import java.util.*;

public class ArrayDequeMethods {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.offer("sai");
		ad.offer("vijay");
		ad.offer("vijay1");
		ad.offer("vijay2");
		ad.offer("vijay3");
		System.out.println(ad);
		ad.offerFirst("hai");
		System.out.println(ad);
		ad.poll();
		System.out.println(ad);
		Object o=ad.peek();
		System.out.println(o);
		System.out.println(ad);
	}

}
