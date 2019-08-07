//superKeyword example
class A1{
	String color="yellow";
	int a=10;
	A1(){
		System.out.println("a");
	}
}
class B11 extends A1{
	String color="red";
	int a=20;
	B11(){
		System.out.println(color);
		System.out.println(super.color);
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class SuperKeyword1{
	public static void main(String[] args) {
		B11 d=new B11();
	}
}
