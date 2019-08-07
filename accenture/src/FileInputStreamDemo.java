
import java.io.*;

//fileInputStream and writing the character in file and retrieving the characters from file;

public class FileInputStreamDemo {    
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("f:\\input.txt");
		String c="hiiii java";   //string cant be loaded in write();
		byte[] b=c.getBytes();   //we should convert the string in bytes
		f.write(b);      //after creating then added to write();
		FileInputStream d=new FileInputStream("f:\\input.txt");
		int i=d.read();
		System.out.println(i); //read() return type is integer
		System.out.println(((char)i));
		f.close();
		d.close();
	}
}
