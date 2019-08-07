package variables;

public class Variables_Demo {
	int x=10;//instance variables
	static int y=20;//static variables 
	static String college="gist";
	static {//static block
		System.out.println("hi");
	}

	public static void main(String[] args) {
		college="n";
		System.out.println(college);
		y=30;
		System.out.println(y);
		System.out.println(new Variables_Demo().x);
	}
	static {
		System.out.println("hello");
	}

}
