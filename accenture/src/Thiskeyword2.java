class Parent7{
	int h;
	Parent7(int i){
		this.m1();	
	}
	public void m1() {
		System.out.println("hai");
	}
	public void m2() {
		System.out.println("hello2");
	}
}class Child7 extends Parent7{
	Child7(){
		super(10);
		super.m2();
		this.m1();
		System.out.println("j");
	}
	public void m1() {
		
		System.out.println("hello1");
	}
	
}
public class Thiskeyword2{

	public static void main(String[] args) {
		Child7 h=new Child7();
		
	}

}
