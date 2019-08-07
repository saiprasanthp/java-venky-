//writing a string to the file
import java.io.*;
public class File_Output_Stream {

	public static void main(String[] args) {
		try {
		FileOutputStream d=new FileOutputStream("F:\\jai.txt");
		FileInputStream f=new FileInputStream("F:\\jai.txt");
		String s="Java FileInputStream class obtains input bytes from a file.";
		byte[] b=s.getBytes();
		d.write(b);
		System.out.println("success");
		int i=0;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		}d.close();
		f.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
