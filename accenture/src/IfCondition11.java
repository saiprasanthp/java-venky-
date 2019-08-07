import java.util.Scanner;

public class IfCondition11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		System.out.println("enter number2");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("it is greater"+a);
		}else {
			System.out.println("it is greater"+b); 
		}sc.close();
	}

}
