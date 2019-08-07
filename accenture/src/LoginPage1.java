//login page
import java.util.Scanner;
class Valid{
	String user="sai";
	String pwd1="123";
	void validate(String h,String s) {
		if(h.equals(user)&&s.equals(pwd1)){
			System.out.println("login");
		}else {
			System.out.println("end out");
		}
	}
}
public class LoginPage1 extends Valid{
	//int flag=0;
	
	boolean validate(String[] str, boolean flag) 
	{
		if(str[0].equals(user)&&str[1].equals(pwd1)) {
			System.out.println("login");
			return flag;
		}
		else 
		{
			System.out.println("Entered details are incorrect, Please try again!");
			flag=false;
			return flag;
		}	
	}


		String[] EnterDetails()
		{
			String[] str = new String[2];
			Scanner sc=new Scanner(System.in);
			//LoginPage1 d=new LoginPage1();
			System.out.println("enter login name");
			str[0]=sc.next();
			System.out.println("enter password");
			str[1]=sc.next();
			sc.close();
			return str;
		}
	
	public static void main(String[] args) {
		boolean flag=true;
		while(flag)
		{
		LoginPage1 lp = new LoginPage1();
			String[] str = lp.EnterDetails();
			boolean result = lp.validate(str, flag);
			if(result == true)
			{
				break;
			}
		}


	}
}


