//example on static keyword
 class S{
	static public void m1() {
		System.out.println("static parent class");
	}
	
}class H extends S{
	static public void m1() {
		System.out.println("static child class");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		H j=new H();
		j.m1();
	}

}
