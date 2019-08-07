//returning an array from method
public class Arrays11 {
	int a;
	Arrays11(){
		System.out.println(a);
	}
	static int[] get() {
		return new int[] {10,20,30};
	}
	static char[] get1() {
		return new char[] {'a','b'};
	}

	public static void main(String[] args) {
		Arrays11 d=new Arrays11();
		int[] x=get();
		char[] f=get1();
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	
		

	}

}
