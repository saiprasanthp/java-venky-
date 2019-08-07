//using passing example
class Thread{
	int a=m3();
	int m3() {
		return 90;
	}
	
	void m1() {
		System.out.println("hey man");
	}
	void m2() {
		System.out.println("hello guru");
	}
}
public class ReturnExamples3 {
	Thread t;
	String s;
	String name;
	
	ReturnExamples3(Thread t,String s,String name){
		this.t=t;
		this.s=s;
		this.name=name;
		t.m1();
		t.m2();
	}void display(){
		System.out.println(t);
		System.out.println(s);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t);
		System.out.println(t.a);
		ReturnExamples3 d=new ReturnExamples3(t,"sai","nellore");
		d.display();
		

	}

}
