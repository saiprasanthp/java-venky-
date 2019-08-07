//for loop example
import java.util.Scanner;
public class ForLoop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(i%2==0) {
				System.out.println("it is even number"+i);
			}
			else {
				System.out.println("odd number"+i);
			}
		}

	}

}
