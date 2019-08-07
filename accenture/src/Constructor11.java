class TestL{
	TestL(){
		System.out.println("hai suubu");
	}
	
}class Hl extends TestL{
	int a;
	Hl(int a){
		this.a=a;
		//super();
		boolean h=this.m1();
		System.out.println(h);
	}
	public boolean m1() {
		boolean flag=true;
		for(int i=0;i<10;i++) {
			if(i==4) {
				return flag;
			}
			System.out.println(i);
				
		}
		return false;
	}
}
public class Constructor11 {

	public static void main(String[] args) {
		Hl g=new Hl(10);
		System.out.println(g.a);
	}
}
