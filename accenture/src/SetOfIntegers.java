//wap to display sum of integers and odd numbers
import java.util.Scanner;
public class SetOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int sum=0;
		int temp=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			else {
				temp=temp+i;	
				}	
			}
		System.out.println("even numbers"+sum);
		System.out.println("odd numbers"+temp);
		sc.close();


		
		}
		

	}


