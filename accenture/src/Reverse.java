//wap to reverse the given number
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int a=sc.nextInt();
		 int rem=0;
		 int temp=0;
		 while(a!=0) {
			 rem=a%10;
			 temp=(temp*10)+rem;
			 a=a/10;
			 
			 
		 }
		 System.out.println(temp);
		 sc.close();

	}

}
