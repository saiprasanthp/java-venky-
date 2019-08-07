//overridding to non_accessmodifiers
class Parent4{
	strictfp public void m1() {
		System.out.println("parent method");
	}
	synchronized public void m2() {
		System.out.println("parent synchronized method");
	}
	public native void m3() ;
	
}class Child5 extends Parent4{
	 public void m1() { //no issue if u add strictfp non-access modifier
		System.out.println("strictfp child method");
	}
	public void m2() {//no problem if u add synchronized non-access modifier
		System.out.println("synchronized child method");
	}
	
}
public class Non_AccessModifiers {

	public static void main(String[] args) {
		Child5 d=new Child5();
		d.m1();
		d.m2();
		

	}

}
