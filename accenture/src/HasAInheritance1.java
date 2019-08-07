//wap on hasa
class Dell{
	int a=10;
	Dell(){
		System.out.println("hello2");
	}
}
class Hp {
	Dell d;
	Hp(Dell d){
		this.d=d;
		System.out.println("hello");
		System.out.println(d.a);
	}
}
public class HasAInheritance1 {

	public static void main(String[] args) {
		
		Dell d=new Dell();
		Hp s=new Hp(d);
		
	}
}
