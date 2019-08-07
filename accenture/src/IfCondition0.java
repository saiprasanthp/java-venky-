//take the length and breadth of a rectangle and chrck it is square or not
import java.util.Scanner;
public class IfCondition0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int a=sc.nextInt();
		System.out.println("enter breadth");
		int b=sc.nextInt();

		if(a==b) {
			System.out.println("it is square");
		}else {
			System.out.println("it is not square");
		}
		sc.close();
		
		
 
	}

}
