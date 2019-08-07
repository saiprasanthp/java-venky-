//this keyword
public class ThisKeyword11 {
	int a;
	boolean b=true;

	ThisKeyword11() {
		this.m1(this);
		System.out.println();
		System.out.println("jia");
		
	}
	void m1(ThisKeyword11 f) {
		this.m1();
		System.out.println(f);
		System.out.println(f.a);
		System.out.println("hai");
	}
	void m1() {
		
		System.out.println("m1method");
	}
	ThisKeyword11 m2() {
		return this;
	}
	ThisKeyword11 m3() {
	if(b==true) {
		return this;
	}return this;
	}
	public static void main(String[] args) {
		ThisKeyword11 f=new ThisKeyword11();
		
		
	}
}
