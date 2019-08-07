
public class PrintStar {

	public static void main(String[] args) { 
		/*for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}*/               
		String s="hello";
		char[] c=s.toCharArray();
		int b=c.length;
		for(int i=b;i>0;i--)
		{
			System.out.print(c[i-1]);
		}
		String z="hai";
		for(int i=z.length();i>0;i--) {
			System.out.println(z.charAt(i-1));
		}
	}
}
