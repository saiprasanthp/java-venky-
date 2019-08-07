//setters and getters method
import java.util.Scanner;
public class SettersGetters {
	private String name;
	private int a;
	

	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name=name;	
	}
	public int setA(int a) {
		return this.a=a;
	}
	public int getA() {
		return a;
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SettersGetters d=new SettersGetters();
		System.out.println("enter name");
		String s=sc.next();
		d.setName(s);
		System.out.println(d.getName());
		d.setA(10);
		System.out.println(d.getA());
		

		

	}

}
