class Mike{
	public void m2() {
		
	}
}
class Bell1{
	public void m3() {
		
	}
}
class Dell1{
	Bell1 h;
	public Dell1(Bell1 h) {
		this.h=h;
	}
	public void m1() {
		Mike j=new Mike();
		j.m2();
		h.m3();
	}
}
public class Has_Relation_1 {

	public static void main(String[] args) {
		Bell1 p=new Bell1();
		Dell1 n=new Dell1(p);
		n.m1();

	}

}
