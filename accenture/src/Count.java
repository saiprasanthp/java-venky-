//count of two digits
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int count=0;
		
		while(a!=0) {
			a=a/10;
			count++; 
			
			
		}
		System.out.println(count);
		sc.close(); 
		
		

	}

}
