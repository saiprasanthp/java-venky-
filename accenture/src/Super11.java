//super keyword examples
class employee12{
	String color="pink";
	employee12(){    //it executes first because jvm will automatically calls the constructor
		System.out.println("employee constructor");
	}
	void m2() {
		System.out.println("hello");
	}
}class Developer extends employee12{
	String color="yellow";
	Developer(){
		System.out.println("developer constructor");
	}
	void m1() {
		System.out.println(color);
		System.out.println(super.color);
		super.m2();//invoking the parent method
	}
}
public class Super11 {
	public static void main(String[] args) {
		Developer d=new Developer();
		d.m1();
	}

}
