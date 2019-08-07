package com.map.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo_OwnClass {
	public static void main(String[] args) {
		Map<Integer,String> t=new TreeMap<Integer,String>();
		t.put(11, "sai");
		t.put(11, "sai");
		t.put(12, "sai");
		t.put(1, "sai");
		t.put(41, "sai");
		//System.out.println(t);
		Set<Entry<Integer,String>> s=t.entrySet();
		Iterator<Entry<Integer,String>> k=s.iterator();
		try {
			PrintWriter writer=new PrintWriter("C:\\Users\\user\\Documents\\New Text Document (2).txt");
			while(k.hasNext()) {
				Entry<Integer,String> v=k.next();
				writer.println(v);
			}
			p();
			writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void  p() {
		try {
		InputStream i=new FileInputStream("C:\\Users\\user\\Documents\\New Text Document (2).txt");
		Properties p=new Properties();
		p.load(i);

		Set<Object> l=p.keySet();
		Iterator<Object> obj=l.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
