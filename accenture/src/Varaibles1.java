//variables examples
public class Varaibles1 {
	int a=20;
	int b=30;
	static int c=40;
	final int h=90;//final can not be changed
	String s="hello";
	String s2=new String("main");
	StringBuffer f=new StringBuffer("hai");
	public static void main(String[] args) {
		Varaibles1 d=new Varaibles1();
		d.a=100;
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(c);
		System.out.println(d.h);
		String s1=d.s.concat("hello2");
		System.out.println(s1);
		System.out.println(d.s2.equals(d.s));
		System.out.println("main");
		System.out.println(d.f);
		d.f.append("world");
		System.out.println(d.f);
		StringBuilder j=new StringBuilder("jai");
		j.insert(1, "java");
		System.out.println(j);
		StringBuilder k=new StringBuilder("java");
		k.replace(1, 3, "hello");
		System.out.println(k);
		System.out.println(k.reverse()); 
	}
}
