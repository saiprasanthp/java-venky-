//example on has_a relation
class Address8{
	void m2() {
		System.out.println("addess8 class");
	}
}	
class Hai{
	void m1() {
		System.out.println("parent class");
	}
}
public class Has_aRelation1 extends Hai{
	Address8 g;
	String name;
	
	Has_aRelation1(Address8 g,String name){
		this.g=g;
		this.name=name;	
	}
	void m3() {
		g.m2();
		System.out.println("child class");
	}
	public static void main(String[] args) {
		Address8 d=new Address8();
		System.out.println(d.getClass().getName());
		Has_aRelation1 f=new Has_aRelation1(d,"sai");
		f.m1();
		f.m3();	
	}
	
	}
		

