//practise1 about strings
import java.util.Scanner;
public class Facebook {
	private String login2=m3();
	String m3(){
		return "sai ";
	}
	int  a;
	void login(String login1) {
		if(login2.equals(login1)){ 
			System.out.println("it is true");
		}else {
			System.out.println("incorrect email address:" +login1);
		}
	}
	void password(int a){
		this.a=a;
		if(a==1234 || a==4321) {
			System.out.println("its is correct");
			//System.out.println("HERE IS THE LOGIN BUTTON");
		}else {
			System.out.println("it is wrong password:"+a);
			//System.out.println("no to display");
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Facebook d=new Facebook();
		System.out.println("enter login email");
		String login1=sc.next();
		d.login(login1);
		System.out.println("enter password");
		int h=sc.nextInt();
		d.password(h);
		sc.close();	
	}

}
