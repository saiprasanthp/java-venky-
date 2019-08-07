import java.util.Scanner;

public class And {
	int a=20;
	int b=10;
	void and() {
		if((a<b)&&(b<a)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println((a>b)&(++b<a));
		System.out.println(++b);
	} 
	void m2() {
		int a=50;
		a++;
		
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		And t=new And();
		t.and();
		t.m2();

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n =sc.nextInt();
	if(n>=0){
		System.out.println("number is positive");
		if(n%2==0) {
			System.out.println("it is even number");
		}
		else {
			System.out.println("it is odd number");
		}
	}
	else {
		System.out.println("number is negative");
	}
	
		
		
 
	}

}
