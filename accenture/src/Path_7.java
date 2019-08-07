import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//path_7 example 
//taking input from the file and doing the operations
public class Path_7 {
	static public String userEntered() {
		Scanner d=new Scanner(System.in);
		System.out.println("enter name");
		String name=d.next();
		return name;
	}
	static boolean checkFile(String user) {
		String a="";
		try {
		Path path=Paths.get("F:\\New Text Document.txt");
		Scanner sc=new Scanner(path);
		
		while(sc.hasNextLine()) {
			 a=sc.nextLine();
		}
		if(a.contains(user)) {
			//System.out.println("hai");
			return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	public static void main(String[] args) {
		String name=userEntered();
		            boolean result=checkFile(name);
		            System.out.println(result);
		            if(result==true) {
		            	System.out.println("correct:"+name);
		            }else {
		            	System.out.println("not exists");
		            }
	}

}
