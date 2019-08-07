//banking example
class RealExample{
	int acc_no;
	String holderName;
	float amount;
	void holderDetails(int a,String name,float f) {
		acc_no=a;
		holderName=name;
		amount=f;
	}
	void deposite(float f) {
		amount=amount+f;
		System.out.println("deposite"+f);
	}
	void withdrawl(float f) {
		if(f>amount) {
			System.out.println("insufficient balance");
		}else {
		amount=amount-f;
		System.out.println("withdrawl"+f);
		}
	}
	void checkBalance() {
		System.out.println(amount);
	}
	void display() {
		System.out.println(acc_no+holderName+amount);
	}
	
	
}
public class Banking {

	public static void main(String[] args) {
		RealExample e=new RealExample();
		e.holderDetails(33441155,"anil",1000);
		e.display();
		e.deposite(30000);
		e.checkBalance();
		e.withdrawl(0);
		e.checkBalance();

	}

}
