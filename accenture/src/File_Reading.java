//file reading
import java.util.Scanner;
import java.io.*;
public class File_Reading {

	public static void main(String[] args) {
		try {
			
		FileInputStream d=new FileInputStream("F:\\input.txt");
		Scanner sc=new Scanner(d);
		if(sc.hasNextLine()) {
			String s=sc.nextLine();
			System.out.println(s);
			int i=s.length();
			while(i>0){
				System.out.println(s.charAt(i-1));
				i--;
				}	
		}sc.close();
		System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
