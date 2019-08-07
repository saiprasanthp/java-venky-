//wap to reverse a string
import java.util.Scanner;
public class ConvertString {

	//public static void main(String[] args) {
		/*Scanner d=new Scanner(System.in);
		System.out.println("enter a string");
		String s=d.nextLine();
		char[] c=s.toCharArray();
		//int l=c.length;
		for(int i=c.length;i>0;i--) {
			System.out.println(c[i-1]);
		}d.close();	
		
		//System.out.println(c);
		*/
		
		
		//////another method of revering a string

;

	String reverse(String s)
	{
	 if(s.length() == 0)
     	 return " ";
  	 return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
	}
	public static void main(String[ ] arg)
	{
		ConvertString rev=new ConvertString();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  str=sc.nextLine();	
	System.out.println("Reverse of a String  :"+rev.reverse(str));
		
	}

}
