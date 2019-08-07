//largest of three numbers using scanner
import java.util.Scanner;
public class IfCondition {

	public static void main(String[] args) {
		String name="jai";
		String name1="jai";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number");
		double a=sc.nextDouble();
		System.out.println("enter a second number");
		double b=sc.nextDouble();
		System.out.println("enter a third number");
		double c=sc.nextDouble();
		if(a>b&&a>c) {
			System.out.println("a is larger number"+a);
		}else if(b>c&&b>a) {
			System.out.println("b is larger number"+b);
		}else {
			System.out.println("c is larger number"+c);
		}sc.close();
		
		if(name.equals(name1)) {
			System.out.println("correct");
		}else if(name==name1) {
			System.out.println("enter");
		}else {
			System.out.println("else");
		}
		


	}

}
