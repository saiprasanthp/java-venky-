import java.util.Scanner;
//to find the highest of three numbers
public class IfCondition2 {

	public static void main(String[] args) {
		/* int a=20;
		 int b=30;
		int c=40;
		if((c>b)&&(c>a)){
			System.out.println(c);
		}*/
		
		//terinary operator
		/*int x=(a>b)?20:((c<b)?30:40);
		System.out.println(x);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("1number is largesthythyt:"+a);
		}else if((b>a)&&(b>c)) {
			System.out.println("2nd number is largest:"+b);
			
		}else if((c>a)&&(c>b)) {
			System.out.println("3rd number is largest:"+c);
		}else {
			System.out.println("no number found");
		}

		
	}

}
