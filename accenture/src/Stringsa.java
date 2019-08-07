import java.util.Scanner;

public class Stringsa {

	public static void main(String[] args) {
		String s1="101;102hai";
		String s2="102;103hai";
		String ar[]=s1.split(";");
		System.out.println(ar.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter number");
		String  s=sc.next();
		for(int i=0;i<ar.length;i++) {
		if(ar[0].equals(s)) {
			System.out.println(ar[1]);
			break;
		}
		}
	}

}
