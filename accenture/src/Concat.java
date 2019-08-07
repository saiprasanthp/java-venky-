//concat() of two strings
import java.util.Scanner;
public class Concat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string1");
		String s=sc.next();
		System.out.println("enter a string2");
		String s1=sc.next();
		sc.close();
		System.out.println(s.concat(s1));
	

	}

}
