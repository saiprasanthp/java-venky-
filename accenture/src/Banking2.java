//banking program
class Bank{
	float amount;
	int a=20;
	int c=m2();
	int m2() {
		return 30;
	}
	Bank(){
		System.out.println("hello");}
		void said() {
			System.out.println("bank method said");
		}
	}	
public class Banking2 {
	Bank b;
	int acc_no;
	String name;
	float amount;
	Banking2(Bank b,int acc_no,String name,float amount){
		this.b=b;
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;	
	}
	void display() {
		System.out.println(b.a);
		System.out.println(b.c);
		System.out.println(acc_no+" "+name+" "+amount);
	}
	void deposite(float d){
		amount=amount+d;
		System.out.println("deposite"+d);
	}
	void display1() {
		System.out.println("total amount"+amount);
	}
	void hello() {
		b.said();
	}
	
	public static void main(String[] args) {
		Bank d=new Bank();
		Banking2 f=new Banking2(d,3222,"raja",2000);
		f.display();
		f.deposite(2000);
		f.display1();
		f.hello();
		
  
	}
	

}
