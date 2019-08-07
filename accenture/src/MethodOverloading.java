//method overloading
public class MethodOverloading {
	static int m1(int a,int b) {
		return a+b;
	}
	static int m1(int a,int b,int c) {
		return a+b+c;
	}
	int m3(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverloading d=new MethodOverloading();
		System.out.println(m1(10,20));
		System.out.println(m1(30, 40,40));
		System.out.println(d.m3(20,60));
	}
}
