//static example
public class Static1 {
	int a=20;
	int b=40;
	static int c=90;

	public static void main(String[] args) {
		Static1 d=new Static1();
		d.a=60;
		d.b=100;
		//c=800;
		System.out.println(d.a);
		System.out.println(c);
		System.out.println(d.b);
		Static1 d1=new Static1();
		//d1.c=388;
		System.out.println(c);
		System.out.println(d1.b);

		

	}

}
