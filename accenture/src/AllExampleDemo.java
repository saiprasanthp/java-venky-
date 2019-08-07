//wap on all methods,constructors
class All{
	int a;
	int b=m1(a);
	int c=b;
	static int d;
	int e;
	String f;
	int g;
	String h;
	short s=(short)a;
	static String college;
	private int m1(int a) {
		return 20;
		
	}
	
	static {
		 d=m2();
		 System.out.println(d);
	}
	private static int m2() {
		return 60;
	}
	static void m3() {
		 college="gist";
	}
	All(int a,String b){
		e=a;
		f=b;
		
	}
	All(All s){
		e=s.e;
		f=s.f;
		
	}
	void display() {
		System.out.println(e+f+college);
	}
	
	void display2() {
		System.out.println(a+"  "+b+" "+c+" "+d);
	}
}
public class AllExampleDemo {

	public static void main(String[] args) {
		All.m3();
		All d=new All(101,"sai");
		All d2=new All(d);
		d.display();
		d2.display();
		d.display2();
		
		

	}

}
