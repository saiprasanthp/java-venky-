import java.util.Scanner;
public class IfCondition9 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter age");
   int age=sc.nextInt();

if(age>=18) {
	System.out.println("he is eligible for vote");
	
}else {
	System.out.println("he is not elegible for vote");
}sc.close();
	}

}
