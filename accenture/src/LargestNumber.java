import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int large=0;
		for(int i=0;i<=n;i++) {
			if(i<=n) {
				large=i;
			}
		}
		System.out.println("largest number is"+large);



	}

}
