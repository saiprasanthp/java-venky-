//practise examples for displaying the username and password in the console
import java.util.Scanner;
public class Practise {
	private String a=m1();
	private String b=m2();
	String m1() {
		return "sai";
	}
	String m2() {
		return "123";
		}
	public void username(String name) {
		if(a.equals(name)) {
			//System.out.println(""); 
		}	
	}
	public void password(String name1) {
		if(b.equals(name1)) {
			//System.out.println(" ");
		}	
	}
	boolean validate(String name,String name1) {
		if((a.equals(name)) && (b.equals(name1))){
			return true;	
		}
		return false;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Practise d=new Practise();
		System.out.println("enter user name");
		String name=sc.next();
		d.username(name);
		System.out.println("enter password");
		String name1=sc.next();
		d.password(name1);
	boolean login=d.validate(name,name1);
		if(login!=false) {
			System.out.println("login");
		}else {
			System.out.println("invalid username or password");
		}sc.close();
	}

}
