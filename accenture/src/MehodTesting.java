
public class MehodTesting {

	public static void main(String[] args) {
		MehodTesting j=new MehodTesting();
		j.m2("ki");
		j.m2("l");
		j.m2("los");
		j.m2("l",10);
		m1("sai");
		m1("jai");

	}
	public static void m1(String name) {
		System.out.println(name);
	}
	public void m2(String name) {
		System.out.println(name);
	}
	public void m2(String name,int i) {
		System.out.println(name+i);
	}

}
