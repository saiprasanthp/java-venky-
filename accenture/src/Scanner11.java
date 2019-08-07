//Scanner class Example for writing 
import java.util.Scanner;
public class Scanner11 {
	public void m1() {
		Scanner d=new Scanner(System.in);
		System.out.println("enter name");
		String s=d.next();
		System.out.println("enter age");
		String age=d.next();
			//System.out.println("age"+age);
			System.out.println("enter sex");
			String sex=d.next();
			if(sex.equals("male")||sex.equals("female")) {

			System.out.println("enter proffission");
			String p=d.next();
			System.out.println("enter sports");
			String sp=d.next();
			this.validate(s,age,sex,p,sp);

		}else {
			System.out.println("wrong input");
		}
		/*System.out.println("enter sex");
		String sex=d.next();
		System.out.println("enter proffission");
		String p=d.next();
		System.out.println("enter sports");
		String sp=d.next();
		this.validate(s,age,sex,p,sp);*/
	}
	public void validate(String s,String age,String sex,String p,String sp) {
		System.out.println("name="+s);
		System.out.println("sex="+sex);
		System.out.println("profession="+p);
		System.out.println("sports="+sp);
	}

	public static void main(String[] args) {
		Scanner11 j=new Scanner11();
		j.m1();

	}

}
