package StringToObjectArray;

import java.util.ArrayList;

//object is the super class of all the classes so we can store all the values in an object array
public class ObjectArray {

	public static void main(String[] args) {
		Object[] j=new Object[10];
		j[0]=1;
		j[1]="sai";
		j[2]=3;
		Object[][] k=new Object[1][1];
		k[0][0]="sai";
		
		for(int i=0;i<k.length;i++) {
			
			for(int m=0;m<k.length;m++) {
				
				System.out.println(k[i][m]);
				
				
			}
		}
		String[] str=new String[2];
		int w=1;
		str[0]="sai";
		str[1]=Integer.toString(w);
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(1);
		al.add("sai");
		System.out.println(al);
	}

}
