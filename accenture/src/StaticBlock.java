//staticBlocks
import java.util.Scanner;
public class StaticBlock {
	String name1=m1();	
	String m1(){
		return "sai";
	}
	boolean validate(String name) {
		if(name.equals(name1)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		StaticBlock d=new StaticBlock();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		boolean s=d.validate(name);
		if(s==true) {
			System.out.println("login");
		}else {
			System.out.println("enter again");
			System.out.println("enter name");
			
			

		}

	}

}
