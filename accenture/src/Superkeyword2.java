//wap on super keyword
class Account1{
	int a;
	String name;
	String college;
	int b;
	Account1(int a,String name,String college,int b){    //same constructor as first constructor
		this.a=a;
		this.name=name;
		this.college=college;
		this.b=b;
	}
	Account1(int a,String name,String college){  //second constructor as second constructor
		this.a=a;
		this.name=name;
		this.college=college;
	}
}class Employee2 extends Account1{ //e extends a
	Employee2(int a,String name,String college,int b){
		super(a,name,college,b);  //because first constructor has same feature we have to construct it
		
		
	}Employee2(int a,String name,String college){
		super(a,name,college);	//second constructor has same parameters
	}
	void display() {
		System.out.println(a+" "+name+" "+college+" "+ b);
	}	
}
public class Superkeyword2 {
	public static void main(String[] args) {
		Employee2 d1=new Employee2(101,"sai","gist",101);     //parameters are different need to construct another
		Employee2 d2=new Employee2(102,"manu","gist");//second constructor
		d1.display();//calling display method
		d2.display();//d22 calling display method
	}
}
