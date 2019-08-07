//this keyword examples
class Tree{
	
	void ven() {
		System.out.println("parent class");
	}
	
}class Den extends Tree{
	void ven() {
		System.out.println("child class");
		super.ven();
		
	}
	
}
public class ThisKeyword1 {
	ThisKeyword1 m1(int a) {
		//System.out.println("hello")
		return this;
		
	}
	void m1() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisKeyword1 d=new ThisKeyword1();
		d.m1(10);
		d.m1(100);
		d.m1();
		Den f=new Den();
		f.ven();
		
		

	}

}
