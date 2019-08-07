//static variable example
public class StaticMethod { 
	static int result=m1(5);
	static int m1(int a) {
		return a*a*a;
	}

	public static void main(String[] args) {
		System.out.println(result);

	}

}
