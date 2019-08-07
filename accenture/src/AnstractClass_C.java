//abstract class using the abstract for child
class Parent3{
	public void m1() {
		System.out.println("parent method");
	}
}
abstract class Child3 extends Parent3{
	abstract public void m1();
}
class Child4 extends Child3{
	public void m1() {
		System.out.println("child4 class");
	}
}
public class AnstractClass_C {

	public static void main(String[] args) {
		Child4 h=new Child4();
		h.m1();

	}

}
