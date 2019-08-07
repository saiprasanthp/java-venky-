//even or odd
import java.util.Scanner;
public class EvanOrOdd {

	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int a=sc.nextInt();
            if(a%2==0) {
            	System.out.println("even number"+a);
            }else {
            	System.out.println("odd number"+a);
            }sc.close(); 
	}

}
