//example of inheritance
class InheritanceClass{
	Inheritance2 s;
	String name;
	void m2() {
		System.out.println("this is parent class");
	}
	
}
public class Inheritance2 extends InheritanceClass{
	void m1() {
		System.out.println("this is inheritance method");
	}
	void m3(Inheritance2 a) {
		m1();
		m2();
		
	}
	Inheritance2(){
		System.out.println("this is default constructor");
	}
	Inheritance2(Inheritance2 s,String name){
		this.s=s;
		this.name=name;
	}void display(){
		System.out.println(s+" "+name);
	}

	public static void main(String[] args) {
		 Inheritance2 a=new Inheritance2();
		 System.out.println(a);
		 a.m1();
		 a.m2();
		 a.m3(a);
		 Inheritance2 a1=new Inheritance2(a,"sai");
		 a1.display();

	}

}
