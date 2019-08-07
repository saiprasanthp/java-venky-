//passing a obj examples
class B{
	ReturnExample2 f;
	String name;
	B (ReturnExample2 f,String name) {
	this.f=f;
	this.name=name;
	System.out.println(name);
	System.out.println(f);

	}
}
public class ReturnExample2 {
	ReturnExample2(){
		B d=new B(this,"sai");
		
	}

	public static void main(String[] args) {
		ReturnExample2 d=new ReturnExample2();
		System.out.println(d);

	}

}
