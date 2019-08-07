
//reading all characters in a file by using F ileInputStream
import java.io.*;
public class FileInputStreamDemo2 {
	public static void main(String[] args) {
		try {
		FileInputStream d=new FileInputStream("F:\\input.txt");
		int i=d.read();
		System.out.println((char)i);
		System.err.println("error msg");
		d.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
