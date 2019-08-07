package com.file.improve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
class Gette_Sett{
	String username;
	String password;
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}

}
class FileLoader extends Gette_Sett{
	public void fileLoader() throws Exception{

		BufferedReader bfr=new BufferedReader(new FileReader("F:\\own.txt"));

		String line=bfr.readLine();
		String[] k=new String[4];
		int i=0;
		int j=1;
		int counter=0;
		Scanner sc=new Scanner(System.in);
		while(line!=null) {
			if(i==j-i) {
				k=line.split(":");
				super.setUsername(k[i-1]);
				super.setPassword(k[j-1]);
				System.out.println(username);
				System.out.println(password);
				
			}if(counter==0) {
				i=0;
				j=1;
			}
			i++;
			j++;
			line=bfr.readLine();
		}
		sc.close();
		bfr.close();
		}	

}
		interface FileCreator{
			public abstract void fileCreator() throws Exception;
		}
		class FileCrate implements FileCreator{
			public void fileCreator() throws Exception {
				File f=new File("F:\\own.txt");
				f.createNewFile();
				BufferedWriter bf=new BufferedWriter(new FileWriter(f));
				PrintWriter writer=new PrintWriter(f);
				writer.write("username:password");
				writer.println();
				writer.write("sai:123");
				writer.println();
				writer.write("sai:1234");
				writer.println();
				writer.write("sai:12345");
				System.out.println("hi");
				bf.close();
				writer.close();
				FileLoader fl=new FileLoader();
				fl.fileLoader();
			}

		}

		public class FileCreation1 {

			public static void main(String[] args) {
				FileCreator i=new FileCrate();
				try {


					i.fileCreator();
				}catch(Exception e) {
					e.toString();
				}
				FileLoader m=new FileLoader();
				System.out.println(m.username);
				System.out.println(m.password);
			}
		}

