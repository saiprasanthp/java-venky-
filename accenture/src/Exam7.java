//factorial of a number using scanner
import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<=5;j++) {

		System.out.println("enter number");
		int a=sc.nextInt();
		//for(int j=0;j<=5;j++) {
		int fact=1;
		int i=1;
		while(i<=a) {
			fact=fact*i;
			i++;
		}
		
		System.out.println(fact);
		
		}
		
		
		
		
		 }
	}


