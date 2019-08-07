//multiplication table
import java.util.Scanner;
public class Exam5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		int sum;
		for(int i=1;i<=10;i++) {
			sum=n*i;
			
		System.out.println(sum);	
		}
		//System.out.println(sum);
		

	}

}
