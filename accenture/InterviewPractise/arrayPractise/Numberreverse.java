package arrayPractise;

public class Numberreverse {

	public static void main(String[] args) {
		
		int i=1234;
		int rem=0;
		int temp=0;
		while(i>0) {
			rem=i%10;
			temp=(temp*10)+rem;
			i=i/10;	
		}
		System.out.println(temp);
	}
}
