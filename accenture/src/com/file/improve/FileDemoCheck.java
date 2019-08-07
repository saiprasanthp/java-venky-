package com.file.improve;
import java.io.*;
class Checker{
	public void check() throws Exception {
		BufferedReader g=new BufferedReader(new FileReader("F:\\New Text Document (7).txt"));
		PrintWriter pw=new PrintWriter("F:\\practise.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\\\practise.txt"));
		String f=g.readLine();
		while(f!=null) {
 			pw.println(f);
			f=g.readLine(); 
			if(f==null) { 
				System.out.println("file uplodaded successfully");
			}
		}
		g.close();
		pw.close();
		bw.close();	
	}
	public void check1()  throws Exception{
		FileInputStream fi=new FileInputStream("F:\\practise.txt");
		FileOutputStream g=new FileOutputStream("F:\\New Text Document (15).txt");
		int i=fi.read();
		while(i!=-1) {
			g.write(i);
			i=fi.read();
			if(i==-1) {
				System.out.println("file uploaded");
			}
		}
		fi.close();
		g.close();
	}	
}

public class FileDemoCheck {

	public static void main(String[] args) {
		Checker h=new Checker();
		try {
		h.check();
		}catch(Exception e) {
			e.printStackTrace();
		}try {
		h.check1();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
