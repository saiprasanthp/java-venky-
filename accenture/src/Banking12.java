//banking using super and this keywords
class SBI{
	Long l;
	String name;
	float amount;                                              
	void deposite(float f) {       //deposite method                         
		amount=amount+f;
		System.out.println("deposite"+f);    //deposite amount
		System.out.println("total amount"+amount);	//total amount
	}
	void withdrawl(float d) {   //withdrawl method
		amount=amount-d;
		System.out.println("withdrawl="+d);
		System.out.println("total amout="+amount);    //total amount 
	}
}
class SbiDetails extends SBI{
	SbiDetails(long l,String name,float amount){
		this.l=l;             //long created in parent class
		this.name=name;   //name created in parent class
		this.amount=amount;	//amount created in parent class
	}
	void deposite1() {           //super used to call the method,constructor,instance variables in parent class
		super.deposite(2000);    //deposite method is written in parent class
		super.withdrawl(1000);   //withdrawl method is written in parent class
		
	}void display(){
		System.out.println(l+" "+name+" "+amount);
	}
}
public class Banking12 {
	public static void main(String[] args) {
		SbiDetails d= new SbiDetails(2233,"raja",2000);
		d.display();
		d.deposite1();
	}
}
