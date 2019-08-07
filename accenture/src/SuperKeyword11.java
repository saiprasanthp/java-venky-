//superkeyword using method
class A12{
	A12(){
		System.out.println("world2");
	}
	void m3() {
		System.out.println("hello3");
	}
}
class A13 extends A12{
	A13(){
		System.out.println("world1");
	}
	void m2() {
		super.m3();
		System.out.println("hello2");
	}
}
class A14 extends A13{
	A14(){
		System.out.println("world");
	}void m1(){
		super.m2();
		System.out.println("hello1");
	}	
}
public class SuperKeyword11 {
	public static void main(String[] args) {
		A14 d=new A14();
		d.m1();
	}
}
