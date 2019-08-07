//copy array
public class ArrayCopy {

	public static void main(String[] args) {
		char[] a= {'a','r','r','a','y'};
		char[] b = new char[a.length];
		System.arraycopy(a,0,b,0,5);
		
		
		System.out.println(b);
		

	}

}


