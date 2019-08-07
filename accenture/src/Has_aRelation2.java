//has_a relation example
class Caller{
	void m4() {
		System.out.println("prasanth");
	}
	
}
class Caller1 extends Caller{
	void m1() {
		System.out.println("caller1");
	}
	void m3() {
		System.out.println("jeep");
	}
	
}
class Car{
	void engine(){
		System.out.println("car runs with engine");	
	}
}
public class Has_aRelation2 {
	Caller1 g;
	/*Has_aRelation2(Caller1 g){
		this.g=g;	
	}*/
	void car() {
		Caller1 g=new Caller1();
		g.m1();
		g.m3();
		Car h=new Car();
		h.engine();
		Caller i=new Caller();
		i.m4();
		System.out.println("i got car");
	}
	public static void main(String[] args) {
		//Caller1 g=new Caller1();
		Has_aRelation2 d=new Has_aRelation2();
		d.car();
		//g.m1();
	}
}
