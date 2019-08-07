
package com.single.ton.Demo;

import com.single.ton.SingleTon;

public class SingleTonDemo {


	public static void main(String[] args) {
		SingleTon g=SingleTon.getSingleTon();
		SingleTon f = SingleTon.getSingleTon();
		SingleTon h = SingleTon.getSingleTon();
		
		System.out.println(g);
		System.out.println(h);
		System.out.println(f);
		//g.m1();
		
		
	}

}
