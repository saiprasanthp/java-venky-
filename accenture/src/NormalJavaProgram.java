//normal java program
public class NormalJavaProgram {
	int a=10;
	String h="sai";
	int l=20;
	public static void main(String[] args) {
		NormalJavaProgram h=new NormalJavaProgram();
		System.out.println(h.a);
		System.out.println(h.h);
		System.out.println(h.l);
		String s="hai";
		byte[] n=s.getBytes();
		String s1=new String(n);
		System.out.println(s1);
		char[] c=s1.toCharArray();
		for(int j=c.length;j>0;j--) {
			System.out.println(c[j-1]);
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		for(byte j:n) {
			System.out.println(j);
		}
		

	}

}
