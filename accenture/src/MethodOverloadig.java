class P1{
	public void m1(int i) {
		System.out.println("p1 class");
		System.out.println("subbu");
	}
	public void m1(float g,int h) {
		System.out.println( "gau");
	}
	
}class G extends P{
	public void m1(int i,int k) {
		System.out.println(i);
		System.out.println(k);
		System.out.println("g class");
	}
}
public class MethodOverloadig {

	public static void main(String[] args) {
		G j=new G();
		j.m1(10, 20);
		P1 k=new P1();
		k.m1(10);

	}

}
