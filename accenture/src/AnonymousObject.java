//calling anonymous object
class Anonymous{
	void fact(int d) {
		int fact=1;
		for(int i=1;i<=d;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of given number"+fact);
		
		
	}
	
}
public class AnonymousObject {

	public static void main(String[] args) {
		new Anonymous().fact(5);

	}

}
