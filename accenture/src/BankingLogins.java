import java.util.Scanner;//bankinglogins
class Bak{
	double amount;
	void deposite(double s) {
		amount +=s;
		System.out.println("total amount"+amount);
	}    
	void withdrawl(double j) {
		amount -=j;
		System.out.println("withdrawl amount:"+j);
		System.out.println("total amount"+amount);
	}
}
public class BankingLogins {
	final String name=m1();
	String m1() {
		return "sai";
	}
	final String acc_no=m2();
	String m2() {
		return "123456";
	}
	void validate(String c,String f) {
		if(c.equals(name)&&(f.equals(acc_no))) {
			System.out.println("login");
			Scanner d=new Scanner(System.in);
			Bak g=new Bak();
			System.out.println("enter deposite");
			double n=d.nextDouble();
			g.deposite(n);
			System.out.println("enter withdrwal");
			double m=d.nextDouble();
			g.withdrawl(m);
			d.close();
		}
		else {
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankingLogins d=new BankingLogins();
		System.out.println("enter name");
		String b=sc.next();
		System.out.println("enter acc_no");
		String a=sc.next();
		d.validate(b,a);
		sc.close();
	}
}
