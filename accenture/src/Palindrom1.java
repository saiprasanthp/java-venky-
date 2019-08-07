//palindrom
public class Palindrom1 {

	public static void main(String[] args) {
		int n=12345;
		int temp =0;
		int rem;
		while(n>0) {
			rem=n%10;
			temp=(temp*10)+rem;
			n=n/10;
			
		}
		int a=temp;
		System.out.println(temp);
		if(a==temp) {
			System.out.println("hai");
		}

	}

}
