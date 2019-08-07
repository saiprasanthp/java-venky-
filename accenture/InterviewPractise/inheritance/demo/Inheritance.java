package inheritance.demo;
class A{
	public void m1(int l) {
		System.out.println(l);
	}
	
}
class B extends A{
	public void m1(float l) {
		System.out.println(l);
		
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		B j=new B();
		j.m1(102f);
		j.m1(10); 

	}

}
