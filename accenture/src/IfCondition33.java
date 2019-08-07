//TO FIND CHARACTER IS PRESENT OR NOT
import java.util.Scanner;

public class IfCondition33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
		if((ch>=97) && (ch<=123)||((ch>=64) && (ch<=96) )) {
			System.out.println("yes it exist");
		}else {
			System.out.println("it does not exist");
		}sc.close(); 

	}

}
