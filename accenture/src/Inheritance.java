//example on inheritance
class Employee{
	int acc_no;
	String name;
	float amount;
	void deposite(float f ) {
		amount=amount+f;
		System.out.println("deposite="+f);
	}
	void display1() {
		System.out.println("total amount="+amount);
	}
}
class Programmer extends Employee{ 
	Programmer(int acc_no,String name,float amount){
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	void display() {
		System.out.println("account no:"+acc_no+" "+"acc holdername:"+name+" "+"balance"+amount);
	}
	void withDrawl(float f) {
		amount=amount-f;
		System.out.println("withDrawl="+f);	
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Programmer p=new Programmer(101111,"sai",1000f);
		p.display();
		p.deposite(1000);
		p.display1();
		p.withDrawl(120);
		p.display1();
	}

}
