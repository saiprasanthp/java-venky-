package com.file.improve;
import java.io.*;
interface Capital {
	public abstract void capital() throws Exception ;
}
class InToCapital implements Capital{
	BufferedReader bf;
	public void capital() throws Exception  {
		bf=new BufferedReader(new FileReader("F:\\New Text Document (3).txt"));
		String s=bf.readLine();
		String[] k=new String[100];
		while(s!=null) {
			 k=s.split(",");
			char v=k[0].charAt(0);
			char n=Character.toUpperCase(v);
			String sub=k[0].substring(1);
			System.out.print(n+sub+" ");
			s=bf.readLine();
		}
	}
}
public class FileAndIntoCapital {

	public static void main(String[] args) {
		Capital j=new InToCapital();
		try {
		j.capital();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
