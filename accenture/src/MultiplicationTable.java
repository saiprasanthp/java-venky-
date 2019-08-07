//wap to print the multiplication of a table
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int sum=1;
		for(int i=1;i<=10;i++) {
			sum=a*i;
			System.out.println(a+"*"+i+" ="+sum);
		}sc.close();
		

	}

}
