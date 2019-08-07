//example on scanner class
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		String s="hello";
		Scanner d=new Scanner(s);
		/*System.out.println(d.hasNextLine());
		System.out.println(d.nextLine());
		System.out.println(d.hasNextLine());
*/while(d.hasNextLine()) {
	String g=d.nextLine();
	System.out.println(s);
}
		
		

	}

}
