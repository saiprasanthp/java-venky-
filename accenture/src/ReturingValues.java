//returing values 
public class ReturingValues {
	String name;
	boolean  m1(int b) {
		if(b==10){
			return true;
		}
		return false;
	}
	boolean m2(String n) {
		if(n=="jai") {
			return true;
		} 
		return true;
	}
	int m3() {
		return 30;
	}
	ReturingValues(String name){
		this.name=name;
	}
	ReturingValues m4() { 
		return this;
	}
	public static void main(String[] args) {
		ReturingValues d=new ReturingValues("java");
		int a=10;
		boolean result=d.m1(a);
		if(result!=false){
			System.out.println("hello"); 
		}else {
			System.out.println("hai");
		}
		String b="jai";
	boolean m=d.m2(b);
	if(m!=false) {
		System.out.println("hi");
	}else {
		System.out.println("out");
	}
	int c=d.m3();
	System.out.println(c);
	ReturingValues d1=d.m4();
	System.out.println(d1);
	System.out.println(d);
	for(int i=1;i<=10;i++) {
		if(i==7) {
			break;
		}
		System.out.println(i); 
	}
	System.out.println(d);
}
	
}
