import java.util.Scanner;

//example for has_a_relation
class Validat{
	double deposite;
	void validate(double d) {
		deposite=deposite+d;
		System.out.println(deposite);	
	}
}
public class Has_A_Relation {
	void login() {
		String name="sai";
		String password="1234";
		if(name.equals("sai")&&(password.equals("1234"))) {
			System.out.println("login");
			Validat h=new Validat();
			h.validate(1000);
		}else {
			System.out.println("enter user details");
		}
	}
	public static void main(String[] args) {
		Has_A_Relation g=new Has_A_Relation();
		g.login();
	}
}
