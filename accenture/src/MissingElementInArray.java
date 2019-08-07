import java.util.Scanner;

//missingelementinArray
public class MissingElementInArray {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("enter number");
		int j=d.nextInt();
		int[] b=new int[100];
		for(int i=0;i<b.length;i++) {
			if(b[i]==j) {
				System.out.println(j);
				
			}
			System.out.println(i);
		}d.close();
		
		

	}

}
