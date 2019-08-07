//examples on files if it is exists
import java.io.*;
public class Files1 {

	public static void main(String[] args) {
		File d=new File("F:\\Demo4.txt");
		if(d.exists()) {
			System.out.println(d.length());
			System.out.println(d.canWrite());
			System.out.println(d.canRead());
			System.out.println(d.getName());
			System.out.println(d.getAbsolutePath());
		}else {
			System.out.println("not exits");
		}

	}

}
