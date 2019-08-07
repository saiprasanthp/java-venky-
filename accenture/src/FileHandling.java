//example on file handing
import java.io.*;
public class FileHandling {

	public static void main(String[] args) {
		try{
			File d=new File("f:\\demo3.text");
			System.out.println(d);
			if(d.createNewFile()){
				System.out.println("file is created");
			}else {
				System.out.println("file is not created");
			}
			System.out.println(d.getName());
			System.out.println(d.getAbsolutePath());
			System.out.println(d.length());
			System.out.println(d.canWrite());
			System.out.println(d.canRead());
			if(d.exists()) {
				//System.out.println("it exists");
				System.out.println("file created");
			}else {
				System.out.println("not exists");
			}
		}catch(Exception e) {
			System.out.println("not found file");
			e.printStackTrace();
		}
	}
}
