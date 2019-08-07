//superkeyword example super uses extends keyword
class Account{
	int a;
	String name;
	 Account(int a,String name) {
		this.a=a;
		this.name=name;
	}	
}
class Employee1 extends Account{
	float salary;
	Employee1(int a,String name,Float salary){
		super(a,name);
		this.salary=salary;
	}

	void display() {
		System.out.println(a+" "+name+" "+salary);	
	}	
}
public class SuperKeyword {

	public static void main(String[] args) {
		Employee1 d=new Employee1(101,"ankit",2000f);
		d.display();
	}

}
