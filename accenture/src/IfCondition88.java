//to check weather the year is leap year or not
import java.util.Scanner;

public class IfCondition88 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an year");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println("its is leap year");
		}else {
			System.out.println("it is not a leap year");
		}sc.close();
		

	}

}
