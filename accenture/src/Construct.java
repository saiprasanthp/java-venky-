//example on constructors
class ConstructorDemo2{
	ConstructorDemo2(){
		this(10);
		System.out.println("hello3");
	}
	ConstructorDemo2(int x){
		this(20,30);
		System.out.println("hello2");
	}
	ConstructorDemo2(int a,int b){
		System.out.println("hello1");
		
		
	}
	ConstructorDemo2(ConstructorDemo2 d){
		System.out.println("rite");
	}
	
}
public class Construct {

	public static void main(String[] args) {
		ConstructorDemo2 d=new ConstructorDemo2();
		ConstructorDemo2 d1=new ConstructorDemo2(d);

	}

}
