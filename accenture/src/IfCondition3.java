import java.util.Scanner;

public class IfCondition3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		char c=sc.next().charAt(0);
		//char c='h';
		if ((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U')) {
			
			System.out.println("it is vowel");
		}else {
			System.out.println("it is not vowel");
		}
		
		sc.close();	
		}
		
	
	
	}


