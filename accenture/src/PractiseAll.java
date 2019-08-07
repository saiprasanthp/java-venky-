//practiseall 
class Practise11{
	Practise11(){//automatically called by jvm
		System.out.println("hello this is parent class");
	}
	void m2() {
		StringBuffer f=new StringBuffer("hello");
		f.reverse();
		System.out.println(f);	
	}
}
public class PractiseAll extends Practise11  { 
	String name;
	PractiseAll(String name){
		System.out.println(name);//need to call by use
		
	}
	void m1() {
		this.m2();
		super.m2();		
	}
	void m8(char[] d) {
		String s=new String(d);
		System.out.println(s);
	}
	void m2() {
		String s="sai";
		int s3=s.length();
		System.out.println(s3);		
	}
	void m4(byte[] d) {
		String f=new String(d);//String allows only byte[] and char[]	
	}
	public static void main(String[] args) {
		PractiseAll d=new PractiseAll("hello practise all");
		d.m1();
		char[] c= {'a','b','c','d'};//char[]
		d.m8(c);
		byte[] l= {10,20,30};//byte[]
		d.m4(l);
	}
}
