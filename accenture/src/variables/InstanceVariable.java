package variables;
class J {
	public void m3(InstanceVariable l) {
		System.out.println(l.i);
		
	}
	
}

public class InstanceVariable extends J {
	int i=10;
	public void m1() {
		System.out.println(i);
	   m2(this);
	   m3(this);
		
	}
	public void m2(InstanceVariable j) {
		System.out.println(j.i);
	}
	public static void main(String[] args) {
		InstanceVariable j=new InstanceVariable(); 
		j.m1();

	}

}
