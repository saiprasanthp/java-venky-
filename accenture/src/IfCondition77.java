import java.util.Scanner;
public class IfCondition77 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		double marks=sc.nextDouble();
		if(marks<50) {
			System.out.println("fail");
		}
		else if(marks>=50 && marks<=60) {
			System.out.println("pass");
			char ch=(char)marks;
			System.out.println(ch);
		}
		

	}

}
