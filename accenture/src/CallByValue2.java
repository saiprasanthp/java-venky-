
public class CallByValue2 {
	int a=10;
	int b=m1();
	int m1() {
		return 20;
	}
	static {
		int c=m2();
		System.out.println(c);
		
		
	}
	static int m2() {
		return 40;
	}

	public static void main(String[] args) {
		CallByValue2 t=new CallByValue2();
		System.out.println(t.b);
		

	}

}
