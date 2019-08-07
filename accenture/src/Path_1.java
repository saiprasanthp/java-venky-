import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//path example how to get data form a file
public class Path_1 {
	public static void main(String[] args) {
		try {
		Path path=Paths.get("F:\\New Text Document (2).txt");
		Scanner sc=new Scanner(path);
		if(sc.hasNextLine()) {
			String s=sc.nextLine();
			System.out.println(s);
			String s1=sc.nextLine();
			System.out.println(s1);
			validate(s,s1);
			}
		sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void validate(String s,String s1) {
		if(s.equals("userdetails=sai")&&(s1.equals("accountnum=1234"))) {
			System.out.println(true);	
		}else{
			System.out.println(false);
		}
	}
}
