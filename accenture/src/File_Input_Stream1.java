//example for fileinputstream and getting an input from file to console
import java.io.*;
import java.util.Scanner;
public class File_Input_Stream1 {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("F:\\New Text Document.txt");
		//Scanner sc=new Scanner(f);
		//ther read() of int return type is used to print only one char
		int i=f.read();
		System.out.print((char)i);
		f.close();
		
		
		/*here we created an Scanner class and if the lines
		are present then it will print the all lines*/
		/*if(sc.hasNextLine()) {
			System.out.println("lines found");
		}else {
			System.err.println("lines not found");
		}
		System.out.println("lets start the lesson");
		while(sc.hasNextLine()) {
			String s=sc.nextLine();
			System.out.println(s);
		}
		System.out.println("found record");
		sc.close();*/
		
		/*int i=0;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		}*/
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
