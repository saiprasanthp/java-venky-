//writing the content into the txt file
import java.io.*;
public class Files2 {

	public static void main(String[] args) {
		try {
		FileWriter d=new FileWriter("F:\\Demo5.txt");
		d.write("hello1");
		System.out.println("completed");
		d.close();
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}
	}

}
