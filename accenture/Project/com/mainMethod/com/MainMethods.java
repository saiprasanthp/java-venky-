package com.mainMethod.com;
import com.getters.setters.com.*;

public class MainMethods {

	public static void main(String[] args) {
		gettersSetters h=new gettersSetters();
		
		try {
		String[] m=h.file();	
		for(String l:m) {
			System.out.println(l);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
