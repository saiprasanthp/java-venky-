//plindrome are not
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int rem=0;
		int temp=0;
		int b=a;
		while(a!=0) {
			rem=a%10;
			temp=(temp*10)+rem;
			a=a/10;
			
		}
		
		if(b==temp) {
			System.out.println("it is palindrom");
		}
		else {
			System.out.println("not palindrome");
		}sc.close();
		
		

	}

}
