import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//path example retriving the data from file and checking
public class Path_5 {
	
	public static void main(String[] args) {
		try {
			String[] d=new String[15];
			int i=0;
			Path path=Paths.get("F:\\New Text Document (3).txt");
			Scanner sc=new Scanner(path);
			while(sc.hasNextLine())
			{
				d[i]=sc.nextLine();
				i++; 
			}
			//System.out.println(i);
			System.out.println(d[0]);
			String[] f=d[0].split(",");
			for(String str:f)
			{
			System.out.println(str);
			}
			f[3]=f[3].trim();
			if(f[3].equals("and the"))
			{
				System.out.println("true");
			}else 
			{
				System.out.println("false");
			}sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
