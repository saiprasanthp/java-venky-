//wap to display banking of user using scanner class
import java.util.Scanner;
class Bankin{
	int acc_no;
	String name;
	float amount;
	void checkDetails(int a,String s,float d) {
		acc_no=a;
		name=s;
		amount=d;	
	}
	void deposite(float s) {
		amount=amount+s;
		System.out.println("deposite="+s);	
	}
	void checksAmount() { 
		System.out.println("avaliable balance="+amount);	
	}
	void withDrawl(float g) {
		if(g>amount) {
			System.out.println("insufficient fund");
		}else {
			amount=amount-g;
			System.out.println("withDrawl="+g);
		}
	}
	void display() {
		System.out.println(acc_no+name+amount);
	}
}
public class Banking1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bankin b=new Bankin();
		b.checkDetails(332211,"ajay",2000);
		b.display();
		System.out.println("enter deposite");
		float s=sc.nextFloat();
		b.deposite(s);
		b.checksAmount();
		System.out.println("enter withdrawl");
		float g=sc.nextFloat();
		b.withDrawl(g);
		b.checksAmount();
		sc.close();
	}

}
