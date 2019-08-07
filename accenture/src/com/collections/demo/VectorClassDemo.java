package com.collections.demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class VectorClassDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(double d=1.0;d<=50.0;d++) {
			al.add(d);
		}
		double sum=0.0;
		double sum1=0.0;
		double sum2=0.0;
		double sum3=0.0;		double sum4=0.0;


		for(double d=1.0;d<=20.0;d++) {
			if(d==10.0) {
				sum=sum+d;
				al.add(10,sum+"total");

			}else {

				sum=sum+d;
			}
		}
		for(double d=11.0;d<=20.0;d++) {


			if(d==20.0) {
				sum1=sum1+d;
				al.add(21,sum1+"total");
			}else {

				sum1=sum1+d;
			}

		}
		for(double d=21.0;d<=30.0;d++) {


			if(d==30.0) {
				sum2=sum2+d;
				al.add(32,sum2+"total");
			}else {

				sum2=sum2+d;
			}
		}for(double d=31.0;d<=40.0;d++) {


			if(d==40.0) {
				sum3=sum3+d;
				al.add(43,sum3+"total");
			}else {

				sum3=sum3+d;
			}

		}
		for(double d=41.0;d<=50.0;d++) {


			if(d==50.0) {
				sum4=sum4+d;
				al.add(54,sum4+"total");
			}else {

				sum4=sum4+d;
			}
		}
		ListIterator i=al.listIterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);

		}

	}
}
