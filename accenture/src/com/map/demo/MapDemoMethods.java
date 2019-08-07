package com.map.demo;
import java.util.*;
//program on Map,linkedHashMap
class CustomerDetails {
	String name;
	String city;
	String state;
	public CustomerDetails(String name,String city,String state){
		this.name=name;
		this.city=city;
		this.state=state;
	}
	public String toString() {
		return name+" "+city+" "+state;
	}
	//static Exception e=new Exception();

}

public class MapDemoMethods {

	public static void main(String[] args) throws Exception {
		LinkedHashMap h=new LinkedHashMap();
		CustomerDetails h1=new CustomerDetails("Ram1","nlr1","Ap1");
		CustomerDetails h2=new CustomerDetails("Ram2","nlr2","Ap2");
		CustomerDetails h3=new CustomerDetails("Ram3","nlr3","Ap3");
		CustomerDetails h4=new CustomerDetails("Ram4","nlr4","Ap4");
		CustomerDetails h5=new CustomerDetails("Ram5","nlr5","Ap5");
		ArrayList al=new ArrayList();
		al.add(h1);
		al.add(h2);
		al.add(h3);
		al.add(h4);
		al.add(h5);
		ArrayList al1=new ArrayList();
		for(int i=1;i<=al.size();i++) {
			String s=Integer.toString(i);
			al1.add(s);
		}
		Iterator it1=al1.iterator();
		Iterator it=al.iterator();
		while(it1.hasNext()) {
			while(it.hasNext()) {
				Object obj1=it1.next();
				Object obj2=it.next();
				h.put(obj1,obj2);
			}
		}
		Set k=h.keySet();
		Iterator ii=k.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("ids consists of 1-5");
		System.out.println("enter ids");
		String s=sc.next();
		while(ii.hasNext()) {
			Object j=ii.next();
			if(j.equals(s)) {
				System.out.println(h.get(j));
				break;
		}if(ii.hasNext()==false) {
			throw new Exception("invalid id");
		}
		}
	}
}
 