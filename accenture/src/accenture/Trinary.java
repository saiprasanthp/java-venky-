package accenture;


public class Trinary {
	int a=10;
	int b=20;
	int c;
void m1() {
	     c=a+b;
	 System.out.println(c);
}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int j=30;
		int k;
		int x=(a>b)?a:b;
		System.out.println(x);
		int y=(a>b)?a:((b>a)?a:b);
		System.out.println(y);
		int c=++a;
		System.out.println(c);
		int d=--b;
		System.out.println(d);
		if((a<b) &&(b<j)){
			 k=a++; 
		System.out.println(k);
		}
		else {
			System.out.println("hello");
		} 
		
		//System.out.println(k);
		
		

	}

}
