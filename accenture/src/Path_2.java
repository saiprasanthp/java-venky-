//reading file from the computer
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Path_2 {
	void m1(String k) {
		if(k.contains("figure")) {
			System.out.println(k.indexOf("figure"));
		}		
	}
	public static void main(String[] args) {
		String s = null;
		try {
		Path path=Paths.get("F:\\input.txt");
		Scanner d=new Scanner(path);
		while(d.hasNextLine()) {	
			 s=d.nextLine();
			 System.out.println(s);
			 boolean h=s.contains("working");
			 int index=s.indexOf("working"); 
			 if(h) {
				 System.out.println(index+" "+h);
			 }
		}d.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		//**************object creation*************
		Path_2 g=new Path_2();
		g.m1(s);
		Integer i=10;
		int z=i.intValue();
		System.out.println(z);
	}
}
