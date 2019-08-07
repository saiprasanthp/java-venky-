package com.collections.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Computer implements Comparator<Object> {
	
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return -i1.compareTo(i2);
		}
}
public class File_Comparator {

	public static void main(String[] args)  throws Exception{
		Computer c=new Computer();
		Map<Integer,String> ma=new TreeMap<Integer,String>(c);
		ArrayList<String> al=new ArrayList<String>();
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\user\\eclipse-workspace\\accenture\\src\\com\\collections\\demo\\students.txt"));
		String name =bf.readLine();
		while(name!=null) {
			al.add(name);
			name=bf.readLine();
		}
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			String  ma1=al.get(i);
			ma.put(i, ma1);
		}
		System.out.println(ma);
		bf.close();
	}
}