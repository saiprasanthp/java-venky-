package accenture;
class G{
	int a=10;
	static {
		System.out.println("hello");
	}
	public static int m2(int a,int b) {
		int result=a+b;
		return result;	
	}
}
public class StaticBlocks extends G{
	public static  void m1() {
		G j=new G();
		System.out.println(j.a);
	}
	static {
		System.out.println("hai");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		m1();
		int result=m2(10,20);
		System.out.println(result);
		
	}
	static {
		System.out.println("hello");
	}
}
