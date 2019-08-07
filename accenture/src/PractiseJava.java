import java.util.Scanner;

public class PractiseJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int i=sc.nextInt();
		if(i<=4) {
			switch(i) {
			case 1:
				System.out.println("case 1");
				break;

			case 2:
				System.out.println("case 2");
				break;
			default: 
				System.out.println("not found");
				break;
			}

		}else {
			System.out.println("number not found");
		}
		sc.close();

	}

}
