//passingvalueExample
class Passing{
	void m1() {
		System.out.println("this is passing method");
	}
}
public class PassingValueExample {
	private Passing p;
	private String name;
	PassingValueExample r;

	PassingValueExample(Passing p,String name){
		this.p=p;
		this.name=name;
		
	}
	void display() {
		p.m1();
		System.out.println(p+" "+name);
	}
	PassingValueExample(PassingValueExample d){
		r=d;
		System.out.println(r);
	}

	public static void main(String[] args) {
		Passing d=new Passing();
		System.out.println(d);
		PassingValueExample f=new PassingValueExample(d,"sai");
		System.out.println(f);
		f.display();
		PassingValueExample f1=new PassingValueExample(f);


	}

}
