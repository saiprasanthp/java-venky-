//gcd of two numbers

public class GCD {

	public static void main(String[] args) {
		int a=20;
				int b=40;
		while(a!=b) {
			if(a>b) {
				a=a-b;
				System.out.println(a);
			}else {
				b=b-a;
				System.out.println(b);
			}
		}

	}

}
