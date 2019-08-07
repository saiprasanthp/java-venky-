//basic calculator
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt(); 
		System.out.println("enter operator");
		char c=sc.next().charAt(0);
		System.out.println("enter anothe number");
		int b=sc.nextInt();
		switch(c) {
		case '+':
			int d=a+b;
			System.out.println("answer"+d);
			break;
		case '-':
			int e=a-b;
			System.out.println("answer"+e);
			break;
		case '*':
			int f=a*b;
			System.out.println("answer"+f);
			break;
		case '/':
			int h=a/b;
			System.out.println("answer"+h);
			break;
		default:
			System.out.println("error");
			break;


		}sc.close();

	}

}
