import java.util.Scanner;
//own practise example for Example :Gmail
public class OwnPractise {
	static void  userMethod() {
		Scanner d=new Scanner(System.in);
		System.out.println("enter name");
		String username=d.next();
		System.out.println("enterpassword");
		String pswd=d.next();
		boolean k=validate(username,pswd);
		if(k==true) {
			OwnPractise d1=new OwnPractise();
			d1.inbox();	
		}
	}
	void inbox() {
		Scanner d1=new Scanner(System.in);
		System.out.println("choose 1:for inbox");
		System.out.println("choose 2 :for signout");
		int d=d1.nextInt();
		switch(d) {
		case 1:
			System.out.println("inbox");
			break;
		case 2:
			System.out.println("signout");
			break;
		}
	}
	public static boolean validate(String name,String pwd1) {
		if(name.equals("sai")&&(pwd1.equals("123"))) {
			System.out.println("login");
			return true;
		}else {
			System.out.println("wrong details");
		}return false;
	}

	public static void main(String[] args) {
		userMethod();
		

	}

}
