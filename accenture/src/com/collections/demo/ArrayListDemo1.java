package com.collections.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Properties;
import java.util.TreeSet;
class Ink implements Comparator<Object>{
	public int compare(Object arg0, Object arg1) {
		StudentEntry s=(StudentEntry)arg0;
		String s3=s.g;
		StudentEntry s4=(StudentEntry)arg1;
		String s1=s4.g;
	return 	s1.compareTo(s3);
		
		
	}
}
class StudentEntry  implements Comparable<Object>{
	String g;
	StudentEntry(String  g){
		this.g=g;
	}
	public String toString() {
		return g;
	}
	public int compareTo(Object obj1) {
		StudentEntry h=(StudentEntry)obj1;
		String s2=h.g;
		String s1=this.g;
		if(s1.equals(s2)) {
			return +1;
		}
		return -1;
		
	}
	
	
}

public class ArrayListDemo1 {

	public static void main(String[] args) {
		String stu1=null;
		String stu2=null;
		String stu3=null;
		String stu4=null;
		String stu5=null;

		
		try {
		Properties p=new Properties();
		InputStream i=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\accenture\\src\\com\\collections\\demo\\properties\\File.properties");
		p.load(i);
		 stu1=p.getProperty("101");
		 stu2=p.getProperty("102");
		 stu3=p.getProperty("103");
	     stu4=p.getProperty("104");
		 stu5=p.getProperty("105");
		 
		}catch(Exception e) {
		e.printStackTrace();	
		}
		StudentEntry h1=new StudentEntry(stu1);
		StudentEntry h2=new StudentEntry(stu2);
		StudentEntry h3=new StudentEntry(stu3);
		StudentEntry h4=new StudentEntry(stu4);
		StudentEntry h5=new StudentEntry(stu5);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		TreeSet<StudentEntry> h=new TreeSet<StudentEntry>(new Ink());
		h.add(h1);
		h.add(h2);
		h.add(h3);
		h.add(h4);
		h.add(h5);	
		System.out.println(h);
	}
	

}
