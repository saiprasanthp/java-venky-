//practise2
public class Practise2 {
	String name1=m4();
	int c=m1();
	int d=m3(c);
	int[] a;
	String name;
	int b;
	static String college="gist";
	Practise2(int[] a,String name){
		this.a=a;
		this.name=name;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(name);
		System.out.println(d+":return the value");
		System.out.println(c);
		System.out.println(name1+":returing the string name in the instance variables");
	}
	void method(int b,String name){
		this.b=b;
		this.name=name;
		System.out.println(b+college);
		System.out.println(name+college);

	}
	static void change() {
		college="gite";
	}
	int m3(int f) {
		return 10;
	}
	int m1() {
		return 40;
	}
	String m4() {
		return "jai";
	}
	public static void main(String[] args) {
		Practise2.change();
		int[] x= {10,20,30};
		Practise2 d=new Practise2(x,"sai");
		d.method(101,"hello");
		StringBuffer s=new StringBuffer("dude");
		StringBuffer s1=new StringBuffer("dude");
		//s.equals(s1);
		System.out.println(s.equals(s1));
		s.reverse();
		System.out.println(s);
		
	}

}
