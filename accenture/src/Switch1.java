//switching example
import java.util.Scanner;
public class Switch1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		switch(a){
		case 1:
		case 2:
		case 3:
			System.out.println("winter");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("summer");
			break;

		case 7:
		case 8:
		case 9:
			System.out.println("rainy");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("mansoon");
			break;
		default:
			System.out.println("no season");
		}sc.close();
	}

}
