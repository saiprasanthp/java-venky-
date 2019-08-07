//fileinputstream  class program
import java.util.Scanner;
import java.io.*;
public class File_InputStream {

	public static void main(String[] args) {
		try {
		FileInputStream d=new FileInputStream("F:\\input.txt");
		Scanner sc=new Scanner(d);
		if(sc.hasNextLine()){
			String s=sc.nextLine();
			if(s.equals("hiiii java")) {
				System.out.println("enter login page");
			}else {
				System.out.println("enter again");
			}
			//System.out.println(s);
			System.out.println("success");
		}sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
