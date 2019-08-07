//using Example
public class ThisObject {
	public ThisObject() {
		System.out.println("ar ");
	}
	public ThisObject(int i) {
		this();
		System.out.println("i");
	}
	public ThisObject(int a,int b) {
		//this();
		this(10);
		System.out.println("ar ");
	}
	
	void m1(ThisObject d ) {
		
		this.m2();
		System.out.println("hello2");
	}
	void m2() {
		m3(this);
		System.out.println("hello");
	}
	ThisObject m3(ThisObject d){
		return this;	
	}
	 int m4(int d) {
		return 30;
	}
	public static void main(String[] args){
		ThisObject d=new ThisObject(101);
		d.m1(d);
		d.m4(21);
	}

}
