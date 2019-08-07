//has_arelation  
class Kilo{
	void m2() {
		System.out.println("kilo method");	
	}
}class No{
	Kilo d;
	String name;
	No(Kilo d,String name){
		this.d=d;
		this.name=name;
		d.m2();
	}
	void m1() {
		this.m2();
		System.out.println("enter name");
	}
	void m2() {
		System.out.println("hello dream");
	}
}
class Gun{
	No k;
	Gun(No k){
		this.k=k;
		System.out.println(k.name);
	}
	void m3() {
		System.out.println("hello m3");
	}
}
public class Has_aRelation3 {
	public static void main(String[] args) {
		Kilo f=new Kilo();
		No g=new No(f,"sai");
		Gun j=new Gun(g);
		g.m1();
		g.m2();
		j.m3();
	}
}
