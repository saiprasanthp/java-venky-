//has a relation examples
class Balance1 {
	double withdrawl;
	double amount;
	double  deposite;
	void withdrawl(double s1) {
		withdrawl=deposite-s1;
		System.out.println(withdrawl);		
	}
}
class Correct extends Balance1{
	void depsoite(double amount) {
				if(amount>200000) {
			System.out.println("amount exceeds");
		}else {
			deposite=deposite+amount;
			System.out.println(deposite);
		}
		super.withdrawl(100);
	}
}
public class Has_ARelation {
	String name="sai";
	String password="1234";	
	 boolean login() {
		 if(name.equals("sai")&&(password.equals("1234"))) {
			 return true;
		 }
		 return false;
	 }
	public static void main(String[] args) {
		Has_ARelation d=new Has_ARelation();
		boolean result=d.login();
		if(result==true) {
			System.out.println("enter login page");
			Correct h=new Correct();
			h.depsoite(1000);
			
		}else {
			System.out.println("incorrect");
		}
		

	}

}
