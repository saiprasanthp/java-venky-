//examples in java variables
public class JavaVarriables {
	static int a=20;
	static int b=30;
	static int c;
	static	int d=m1(c);
	static int m1(int f) {
		return 100;
	}
	static {
		int y=m2(b);
		System.out.println(y);
		System.out.println(d);
	}
	static int m2(int g) {
		System.out.println(c);
		return 700;
	}
	

	public static void main(String[] args) {
		JavaVarriables d=new JavaVarriables();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}