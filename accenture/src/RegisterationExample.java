import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//example on Registration page
class RegisterProcess{
	String[] process(){
		String[] j=new String[6];
		System.out.println("choose 1 for registerartion");
		
		Scanner sc=new Scanner(System.in);
	switch(sc.nextInt()) {
	case 1:
		System.out.println("enter name");
		 j[0]=sc.next();
		System.out.println("enter pwd");
		j[1]=sc.next();
		return j;
		
		
	}
	return j;
		
	}

}

public class RegisterationExample {
	static String[] userDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		String[] h=new String[2];
		h[0]=username;
		h[1]=password;
		return h;
		
	}
	static boolean fileDetails(String[] result) {
		String[] str=new String[40];
		try {
			int i=0;
			Path path=Paths.get("F:\\New Text Document (2).txt");
			Scanner scn=new Scanner(path);
			while(scn.hasNextLine()) {
				str[i]=scn.nextLine();
				i++;	
			}
			String[] data=str[0].split("=");
			String[] data1=str[1].split("=");
			if(result[0].equals(data[1])&&(result[1].equals(data1[1]))) {
				return true;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}return false;
		
	}

	public static void main(String[] args) {
		String[] result=userDetails();
		boolean checkResult=fileDetails(result);
		if(checkResult==false) {
			System.err.println("not found");
			System.err.println("register or signup");
			RegisterProcess rp=new RegisterProcess();
			String[] newrg=rp.process();
			for(int i=0;i<newrg.length;i++) {
				System.out.println(newrg[i]);
			}
			try {
			FileWriter d=new FileWriter("F:\\New Text Document (2).txt",true);
			Scanner f=new Scanner(System.in);
			//System.out.println("enter name");
			d.write("prasanth"+"//n"+"1122");
			//d.write("1122");
			 for(int i=0;i<newrg.length;i++) {
				if(newrg[i].equals("prasanth")) {
					 
				}
			}
			d.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		else {
			System.out.println("found details");
		}
		

	}

}
