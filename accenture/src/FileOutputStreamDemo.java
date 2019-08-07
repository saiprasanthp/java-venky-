//fileoutputstream and we can write ie,,add  datatypes
import java.io.FileOutputStream;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
		FileOutputStream d=new FileOutputStream("f:\\manu.txt");
		String s="hello this is java class";
		byte[] b=s.getBytes();
		//System.out.println(b);
		d.write(b);
		d.close();
		System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
