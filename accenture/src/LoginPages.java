//login pages
import java.util.Scanner;
public class LoginPages {
	String name1=m1();
	String m1() {
		return "sai.p2@gmail.com";
	}
	int a=m2();
	int m2() {
		return 1234;
	}
	int b=m3();
	int m3() {
		return 18;
	}
	String name=m4();
	String m4() {
		return "sai";
	}
	void login(String b) {
		if(b.equals(name1)) {
			//System.out.println("username and gmail is correct");
			System.out.println("");	
		}
		else {
			System.out.println("login name:not correct");
		}
	}
	void password(int x) {
		if(x==a) {
			//System.out.println("password is correct");
			System.out.println("");

		}else {
			System.out.println("password:not correct");
		}
	}
	void age(int h) {
		if(h==b) {
			//System.out.println("age is correct");
			System.out.println("");

		}else {
			System.out.println("age:not correct");
		}
	}
	void name(String g) {
		if(g.equals(name)) {
			//System.out.println("name is correct");
			System.out.println("");

		}else {
			System.out.println("name:not correct");
		}
	}
	/*void validation(String s,int v,int x,String n) {
		if(s.equals(name1)&&(v==a)&&(x==b)&&(n.equals(name))){
			System.out.println("enter into login page");
		}
		else{
			System.out.println("enter correct details");
		}
		
	}*/
	boolean validation(String k,int z,int g,String o) {
		if(k.equals(name1)&&(z==a)&&(g==b)&&(o.equals(name))){
			return true;
		}
		return false;	
	}
	public static void main(String[] args) {
		LoginPages d=new LoginPages();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter login id");
		String g=sc.next();
		//d.login(g);
		System.out.println("enter password");
		int m=sc.nextInt();
	//	d.password(m);
		System.out.println("enter age");
		int k=sc.nextInt();
		//d.age(k) ;
		System.out.println("enter name");
		String l=sc.next();
		//d.name(l);
		//System.out.println(" THE LOGIN PAGE");
		d.login(g);
	   d.password(m);
		d.age(k);
		d.name(l);
	boolean	result=d.validation(g,m,k,l);
	if(result!=false) {
		System.out.println("go to login page");
		
	}else{
		System.out.println("enter details again");
	}
	}
}
