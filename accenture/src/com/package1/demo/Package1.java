package com.package1.demo;
import com.package2.demo.*;

public class Package1 {
	static int  j=19;
	public void m1() {
		Package2 h=new Package2();
		h.m2();
		System.out.println(h.i);
		System.out.println(Package2.h);
		System.out.println(j);
	}
}
