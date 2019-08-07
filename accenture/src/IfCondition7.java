import java.util.Scanner;

public class IfCondition7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		if(a>=1 && a<=3 ) {
			System.out.println("winter");
			
		}else if(a>=4 && a<=6) {
			System.out.println("summer");
		}else if(a>=7 && a<=9) {
			System.out.println("rainy");
		}else if(a>=9 && a<=12) {
			System.out.println("mansoon");
		}else if(a==0) {
			System.out.println("non season");
		}else {
			System.out.println("no much season");
		}
	}

}
