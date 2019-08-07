package com.map.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
interface Oppo{
	public abstract void upload() throws Exception;
}

public class Taking_From_File implements Oppo{
	public void upload() throws Exception{
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (19).txt"));
		String s=bf.readLine();
		String[] k=new String[100];
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		int i=0;
		int j=1;
		while(s!=null) {
			k=s.split(",");
			Integer in=new Integer(k[i]);
			t.put(in, k[j]);
			s=bf.readLine();
		}
		Set<Integer> l=t.keySet();
		Iterator<Integer> lo=l.iterator();
		while(lo.hasNext()) {
			Integer ar=lo.next();
			String m=t.get(ar);
			System.out.println(m);
			System.out.println(ar);
		}
		Collection<String> col=t.values();
		Iterator<String> it=col.iterator();
		while(it.hasNext()) {
			String val=it.next();
			System.out.println(val);

		}
		bf.close();	
	}

	public static void main(String[] args) {
		Oppo j=new Taking_From_File();
		try {
			j.upload();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}