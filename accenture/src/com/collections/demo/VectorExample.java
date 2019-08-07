package com.collections.demo;
import java.lang.reflect.Method;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> h=new Vector<String>(2);
		h.add("hi");
		h.add("hi");
		h.add("hi");
		h.add("hi");
		System.out.println(h);
		Object o=new Vector();
		Class c=o.getClass();
		Method[] m=c.getDeclaredMethods();
		for(Method k:m) {
			System.out.println(k.getName());
		}
	}

}
