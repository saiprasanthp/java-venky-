import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//Checking the path 
public class Path_checking {
	static String[] check() {
		Scanner b=new Scanner(System.in);
		System.out.println("enter username");
		String name=b.next();
		System.out.println("enter password");
		String pswd=b.next();
		System.out.println("enter age");
		String age=b.next();
		String[] str=new String[3];
		str[0]=name;
		str[1]=pswd;
		str[2]=age;
		return str;
		
		
	}
	static String[] filePath(String[] str) {
		String[] fp=new String[4];
		int i=0;
		try {
			Path path=Paths.get("F:\\New Text Document (5).txt");
			Scanner sc=new Scanner(path);
			while(sc.hasNextLine()) {
				fp[i]=sc.nextLine();
				i++;
	}
			String[] k=fp[0].split("=");
			String[] k1=fp[1].split("=");
			String[] k2=fp[2].split("=");
			if(str[0].equals(k[1])&&str[1].equals(k1[1])&&(str[2].equals(k2[1]))) {
				//System.out.println(i);
				fp[i]="true";
				return fp;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		fp[i]="false";
		return fp;
		
		
	}
	static  void swit(String[] str,String[] b) {
		Scanner f=new Scanner(System.in);
		String[] k=b[0].split("=");
		String[] k1=b[1].split("=");
		String[] k2=b[2].split("=");
		if(str[0].equals(k[1])&&(str[1].equals(k1[1])&&(str[2].equals(k2[1])))) {
		switch(str[0]) {
		case "sai":
			//System.out.println("enter pwd");
			switch(str[1]) {
			case "123":
				System.out.println("correct");	
			}    
		}
		}
	}
	public static void main(String[] args) {
		String[] inputDetails=check();
		String[] result=filePath(inputDetails);
		if(result[3].equals("true")) {
		swit(inputDetails,result);
		}else {
			System.out.println("invalid username or password ");
		}
	}

}
