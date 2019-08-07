//string method examples
public class StringMethodsExamples {
	boolean m1(char[] f) {
		for(int i=f.length;i>0;i--) {
			System.out.println(f[i-1]);
		}
		return true;
	}
	public static void main(String[] args) {
		StringMethodsExamples d=new StringMethodsExamples();
		String s="hai";
		char[] d1=s.toCharArray();
		boolean name=d.m1(d1);
		System.out.println(name);
		if(name!=true) {
			System.out.println("not matching");
		}else {
			System.out.println("matching");
		}
	}
}
