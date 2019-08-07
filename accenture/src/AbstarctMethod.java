//abstarctMethod using in parentclass 
abstract class Parent1{
	abstract public void m1(int i);
	public void m2() {
		System.out.println("hello");
	}
}
abstract class Child1 extends Parent1{
	abstract public void m1(int i);
	public void m2() {
		System.out.println("hello");
	}
}
class Child2 extends  Child1{
	public void m1(int i) {
		System.out.println(i);
	}
	public void m2() {
		System.out.println("child2 class method");
	}
}
public class AbstarctMethod {

	public static void main(String[] args) {
		Child2 g=new Child2();
		g.m1(10);
		g.m2();
	}

}
