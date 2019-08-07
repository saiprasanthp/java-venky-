package com.file.improve;
//converting an string to array
import java.io.*;
public class FilesConcept3 {

	public static void main(String[] args) {
		try {
			File g=new File("F:\\New Text Document (12).txt");
		BufferedReader bf=new BufferedReader(new FileReader(g));
		String[] j=new String[100];
		String h=bf.readLine();
		
			while(h!=null) {
			j=h.split("\\s");
			System.out.println(j[0]);
			if(j[0].equals("9999")) {
				System.out.println("split method");
				break;
			}
			h=bf.readLine();	
		}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
