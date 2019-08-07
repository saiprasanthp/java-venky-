//power of a number
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int base=sc.nextInt();
		System.out.println("enter exponent");
		int exp=sc.nextInt();
		int temp=1;
		while(exp>0) {
			temp=temp*base;
			--exp;
		}
		System.out.println("result:"+temp);

		

	sc.close();
	}

}
