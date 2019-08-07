//wap on single Inheritance
class A{
	int a;
	int b=m2();
	int m2() {
		return 20;}
	void m1() {
		System.out.println("hello2");
	}
	
}

	class B1 extends A{
	void m1() {
		System.out.println("hello 1");
	}
	
	}

public class SingleInheritance {

	public static void main(String[] args) {
		B1 d=new B1();
		d.m1();
		

	}

}
