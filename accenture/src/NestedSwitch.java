import java.util.Scanner;
public class NestedSwitch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number");
		int rollnum=sc.nextInt();
		System.out.println("enter a marks");
		int marks=sc.nextInt();

		

		switch(rollnum) 
		{

		case 101:
			System.out.println("his name is 101");
			switch(marks) {
			case 90:
				System.out.println("he got 90 marks");
				break;
			case 80:
				System.out.println("he got 80 marks");
				break;}
			break;
			
		case 102:
			System.out.println("his name is 102");
		
			switch(marks) {
			
		case 90:
			System.out.println("he got 90 marks");
			break;
		case 80:
			System.out.println("he got 80 marks");
			break;
			}
			break;
	}
		}

	}




