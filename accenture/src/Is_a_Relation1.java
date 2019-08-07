//is a relation Example
class Hono4{
	void m5() {
		System.out.println("parent 1");
	}
}
class Honor extends Hono4{
	void m1(int a) {
		System.out.println("parent class");
		System.out.println(a);
	}
	void m4() {
		super.m5();
		System.out.println("enter name");
	}
}class Honor2 extends Honor{
	void m1(int a) {
		a=30;
		System.out.println(a);
		System.out.println("child class");
		super.m1(50);
	}
	boolean m3(){
		return true;	
	}
}
public class Is_a_Relation1 {
	public static void main(String[] args) {
		Honor2 d=new Honor2();
		//d.m1();
		d.m1(10);
		//d.m4();
	boolean result=d.m3();
	if(result==true) {
		d.m4();
	}	
	}
}
