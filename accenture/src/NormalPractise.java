//normal practice how to assign a method to instance variables and overriding String method
public class NormalPractise {
	int b;
	int h;
	String s;
	int a=m1(b);
	public int m1( int c) {
		
		 return 20;
	}
	NormalPractise(int h,String s){
		this.h=h;
		this.s=s;
	}
	
	public String toString() {
		return h+" "+s;
	}
	public static void main(String[] args) {
		NormalPractise t=new NormalPractise(2,"sai");
		System.out.println(t.a);
		System.out.println(t);
		

	}

}
