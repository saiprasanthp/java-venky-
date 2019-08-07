class Constructor {
	int a;
	int b;

	Constructor(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a);
		System.out.println(b);

	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Constructor c = new Constructor(10, 20);

	}

}
