//marks getting using if and elseif
import java.util.Scanner;
public class IfCondition1 {
	static int marks=10;
	static double d=marks;
	static {
		//System.out.println(d);
	}



	public static void main(String[] args) {
		//final String name;


		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		double marks=sc.nextDouble();
		if(marks>=50 && marks<=60)
		{
			System.out.println("d grade");
		}
		else if(marks>=60 && marks<=70) 
		{
			System.out.println("c grade");
		}
		else if(marks>=70 && marks<=80)
		{
			System.out.println("b grade");
		}
		else if(marks>=80 && marks<=90)
		{
			System.out.println("a grade");
		}
		else if(marks>=90 && marks<=100)
		{
			System.out.println("a+ grade");
		}else if(marks<=50 )
		{
			System.out.println("fail");
		}else 
			System.out.println("invalid marks");
		}
	}








