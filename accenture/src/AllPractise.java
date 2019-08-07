//practising all in a single program
class Bank1{
	int amount;	
}
class BankDetails extends Bank1{
	String acc_no;
	String name;
	String branch;
	int amount;
	BankDetails(String acc_no,String name,String branch,int amount){
		this.acc_no=acc_no;
		this.name=name;
		this.branch=branch;
		this.amount=amount;		
	}
	 public String toString() {
		return acc_no+" "+name+" "+branch+" "+amount;
	}
	 boolean deposite(int d){
		 amount +=d;
		 if(amount>25000) {
			 System.out.println(amount);
			 return true;
		 }
		 return false;	 
	 }
}
public class AllPractise {
	public static void main(String[] args) {
		BankDetails d=new BankDetails("1020220","sai","nlr",30000);
		boolean money=d.deposite(1000000);
		if(money!=false) {
			System.out.println("amount exceeds than 25000");
		}else {
			System.out.println("display"+money);
		}
		System.out.println(d);	 
		
		}
}
