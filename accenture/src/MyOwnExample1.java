//my own example
class My{
	public boolean m2(String[] h) {
		if(h[0].equals("1")&&h[1].equals("2")){
			return true;
		}
		return false;
	}	
}class J extends My{
	public String[] validate() {
		String[] g=new String[4];
		g[0]="1";
		g[1]="2";
		g[2]="3";
		g[3]="4";
		return g;	
	}
	public void m1(String[] k) {
		boolean j=super.m2(k);
		if(j) {
			System.out.println("subbu");
		}else {
			System.out.println("subbu good boy");
		}	
	}
}
public class MyOwnExample1 {
	public static void main(String[] args) {
		J h=new J();
		String[] j=h.validate();
		h.m1(j);
	}
}
