//passing object
class Dh{
	public void m1() {
		System.out.println("");
	}
}
class DL{
	String g="hai";
Dh dh;
	public DL(Dh dh) {
		this.dh=dh;
		this.m2(g);
	}
	void m2(String h) {
		int i;
		byte[] b= {97,98,99};
		for(byte k:b) {
			System.out.println((char)k);
		}
		char[] j=h.toCharArray();
		for(i=j.length;i>0;i--) {
			System.out.println(j[i-1]);
		}
	}	
}
public class PassingObject {

	public static void main(String[] args) {
		Dh h=new Dh();
		DL j=new DL(h);
		h.m1();
	}
}
