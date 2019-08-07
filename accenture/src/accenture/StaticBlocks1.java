package accenture;

public class StaticBlocks1 {
	static {
		System.out.println("static block1");
	}
	public void m1() {
		System.out.println("m1method");
	}
	public static void main(String[] args) {
		StaticBlocks1 b=new StaticBlocks1();
		b.m1();
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}
}
