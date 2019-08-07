//writing if many lines are there in the text file
import java.io.*;
import java.util.Scanner;
public class File3 {
	public static void main(String[] args) {
		File d=new File("f:\\Demo4");
			Scanner f;
			try {
				f = new Scanner(d);
			
			while(f.hasNextLine()) {
				String s=f.nextLine();
				System.out.println(s);
					}
			f.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		//to write and print the content in the file
		/*try {
		File d=new File("F:\\sai.txt");
		FileWriter f=new FileWriter("F:\\sai.txt");
		f.write("jai");
		Scanner j=new Scanner(d);
		while(j.hasNextLine()) {
			String c=j.nextLine();
			System.out.println(c);
			System.out.println("correct");
		}
		j.close();
		f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		/////////////////////////////another examples//////////////////
		/*try {
			FileWriter f=new FileWriter("f:\\jai.txt");
			f.write("hello"+"hai");
			f.close();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}

}
