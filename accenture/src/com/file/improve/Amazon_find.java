package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Amazon_find {

	public static void main(String[] args) {
		char[] c= {'a','m','a','z','o','n'};
		
	int j;
		try {
			BufferedReader bf=new BufferedReader(new FileReader("F:\\map.txt"));
			String s=bf.readLine();
			int	h=1;
			for(int i=0;i<c.length;i++) {
			while(s!=null) {
			j=s.lastIndexOf(c[i]);
			if(j!=-1) {
				System.out.println("index of"+c[i]+" :"+j);
				System.out.println("line number"+h);
				break;
			}
			else {
				break;
			}	
			}
			s=bf.readLine();
			h++;
			}
			bf.close();
		

		}catch(Exception e) {

		}


	}

}
