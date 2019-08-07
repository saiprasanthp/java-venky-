
public class StaticBlocks {
	static int c=30;
	static int d=callByReference(c);
	
	static int callByReference(int a) {
		System.out.println("hello");
		return c;
	}
	
	
  

	public static void main(String[] args) {
		StaticBlocks t=new StaticBlocks();
		callByReference(40);
		System.out.println(t.c);
		System.out.println(t.d);

	}

}
