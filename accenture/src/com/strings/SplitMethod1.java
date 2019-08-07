package com.strings;
import java.io.*;
interface K1{
	public static final int i=0;
	public abstract void check() throws Exception;

}
class Check implements K1{
	public void chai() {
		System.out.println("ll");
	}
	public void check() throws Exception{
		BufferedReader bf=new BufferedReader(new FileReader("F:\\New Text Document (13).txt"));
		String s=bf.readLine();

		while(s!=null) {
			String[] l=s.split(",");
			if(l[1].equals("2")) {
				System.out.println("first line is correct");
				this.chai();
				break;
			}
			s=bf.readLine();
			if(s==null) {
				throw new Exception("not valid");
			}bf.close();
		}

	}
}
public class SplitMethod1 {

	public static void main(String[] args) {

		K1 j=new Check();
		try {
			j.check();
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
