//example on format
import java.util.Scanner;
public class ExampleOnFormat {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.next();
		System.out.println(String.format("%s", s));
		System.out.println("enter float");
		float s1=sc.nextFloat();
		System.out.println(String.format("%f",s1));
		System.out.println("enter integer");
		int s2=sc.nextInt();
		System.out.println(String.format("%x", s2));
		System.out.println("enter hexadecimal");
		double d=sc.nextDouble();
		System.out.println(String.format("%h",d));
		
		
		

	}

}
