//Ternary operation
public class TerinaryOperation {
	public static void main(String[] args) {
		int a=10;int b=20;
		int c=30;
		int d=((a<b)?((b>c)?30:(c>a)?30:10):40);
		System.out.println(d);
	}
}
