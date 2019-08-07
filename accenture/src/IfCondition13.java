//find a character whether is is there inside r not
import java.util.Scanner;
public class IfCondition13 {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter alphabet");
           char c=sc.next().charAt(0);
           if((c>='a' && c<='z')||(c>='A' && c<='Z') ){
        	   System.out.println("it is correct letter:"+c);
           }else {
        	   System.out.println("error");
           }
	}

}
