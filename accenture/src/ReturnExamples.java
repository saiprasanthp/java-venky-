//return examples
public class ReturnExamples {
	ReturnExamples d;
	int v;
	String g;
	int a=m1();
	int m1() {
		return 20;
	}
	void m2(ReturnExamples d) {
		System.out.println("hello");
		m1();
	}
	ReturnExamples(String s){
		System.out.println(s);
	}
	ReturnExamples(ReturnExamples d,String name){
		this.d = d;
		g=name;
		System.out.println(d);
		System.out.println(g);
		
	}

	public static void main(String[] args) {
		ReturnExamples d=new ReturnExamples("sai");
		System.out.println(d);
		System.out.println(d.a);
		d.m2(d);
		ReturnExamples d1=new ReturnExamples(d,"sai");
		System.out.println(d1);

		

	}

}
