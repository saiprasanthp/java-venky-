//switch example
import java.util.Scanner;
public class Switch21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Switch21 d=new Switch21();
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter operator");
		char c=sc.next().charAt(0);
		System.out.println("enter a number");
		int b=sc.nextInt();
		switch(c) {
		case '+':
			int d1=a+b;
			System.out.println(d1);
		}
		
		
		
	

	}

}
