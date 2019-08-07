 package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FilesTest {
	public static void main(String[] args) {
	BufferedReader bf=null;
	try {
		bf=new BufferedReader(new FileReader("F:\\New Text Document (9).txt"));
		String s=bf.readLine();
		Collection<String> c=new ArrayList<String>();
		while(s!=null) {
			c.add(s);
			s=bf.readLine();
		}
		Iterator<String> it=c.iterator();
		while(it.hasNext()) {
			String j= it.next();
			System.out.println(j);
		}
		Collection<String> c1=new ArrayList<String>(c);
		c1.add("hello");
		Iterator<String> g=c1.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}
	}catch(Exception e) { 
		e.printStackTrace();
	}finally {
		try {
			bf.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	}

}
