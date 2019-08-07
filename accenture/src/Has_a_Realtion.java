class Tress{
	Has_a_Realtion f;
	public Tress(Has_a_Realtion f) {
		this.f=f;
	}
	void m1() {
		f.m2();
		System.out.println("hai");
	}
	
}
public class Has_a_Realtion {
	public void m2() {
		System.out.println("h2llo1");
	}

	public static void main(String[] args) {
		Has_a_Realtion f=new Has_a_Realtion();
		Tress d=new Tress(f);
		d.m1();
		
	}

}
