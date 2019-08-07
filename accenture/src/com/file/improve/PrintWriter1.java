package com.file.improve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
class Invalid extends RuntimeException{
	
}

public class PrintWriter1  {
	PrintWriter1(String s){
		//super(s);
	}

	public static void main(String[] args) {
		BufferedReader bf=null;
		PrintWriter pw=null;
		try {
			 pw=new PrintWriter("F:\\New Text Document (11).txt");
			 bf=new BufferedReader(new FileReader("F:\\New Text Document (10).txt"));
				String s=bf.readLine();
				while(s!=null) {
					pw.print(s);
					s=bf.readLine();	
				}
				if(s==null) {
					System.out.println("file is completed");
					throw new Invalid();
				}
				
		}catch(Exception e) {
			
		}finally {
			try{
			pw.close();
			bf.close();
			}catch(Exception e) {
				e.printStackTrace();
			} 
		}
	

	}

}
