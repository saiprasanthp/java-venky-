import java.util.Scanner;
public class IfCondition44 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	if(a>0 && a<=a) {
		System.out.println("the number is positive and in the range");
	}else if(a<-1) {
		System.out.println("it is not in the range");
	}
	

}
}