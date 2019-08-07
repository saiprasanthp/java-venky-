import java.util.Scanner;

public class IfCondition66 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter1");
		int a=sc.nextInt();
		System.out.println("enter2");
		char b=sc.next().charAt(0);
		if(a==b){
			System.out.println("it is true");
		}
		else {
			System.out.println("it is false");
		}sc.close();
		


}
}