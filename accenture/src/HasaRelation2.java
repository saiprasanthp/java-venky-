//example on has a relation
class Hello{
	void m1(String name){
		System.out.println(name);	
	}
}
class HelloWorld{
	Hello f;
	String name;
	HelloWorld(Hello f,String name){
		this.f=f;
		this.name=name;	
	}
	void m2() {
		f.m1(name);
	}	
}
public class HasaRelation2 {
	public static void main(String[] args) {
		Hello f=new Hello();
		HelloWorld d=new HelloWorld(f,"sai");
		d.m2();
	}
}
