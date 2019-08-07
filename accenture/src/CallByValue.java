//call by value
public class CallByValue {
	int a;
	int b;
	static int j=m1();
	public void call(int c,int d) {
		a=c;
		b=d;
		System.out.println(a);
		System.out.println(b);
	}
	void call2(int c,int d) {
		a=c;
		b=d;
		System.out.println(a);
		System.out.println(b);
	}
	static int m1(){
		return 90;
		
	}static {
		int c=m2();
		System.out.println(c);
	}
	static int m2() {
		return 89;
	}
	
	public static void main(String[] args) {
		CallByValue c=new CallByValue();
		c.call(10,20);
		c.call2(30,40);
		System.out.println(j);
	}

}
