//ReturingObjectExample
class Fish1{
	void m1(String[] str) {
		for(String f:str) {
			System.out.println(f);
		}
	}
}
class kilo1 extends Fish1{
	public String[] dMart() {
		String[] g=new String[5];
		g[0]="hai";
		g[1]="hello";
		g[2]="gai";
		g[3]="loss";
		g[4]="jeep";
		return g;	
	}
	public void m1(String[] str) {
		super.m1(str);
	}
}
public class ReturingObjectExample {

	public static void main(String[] args) {
		kilo1 f=new kilo1();
		String[] str=f.dMart();
		f.m1(str);
	}

}
