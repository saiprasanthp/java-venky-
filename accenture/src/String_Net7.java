//. Write a Java program to get the index of all the characters of the alphabet.
public class String_Net7 {

	public static void main(String[] args) {
		for(int i=97;i<=122;i++) {
			int index=i;
			System.out.println(index+" "+(char)i);
		}
		String s="hai";
		int s2=s.lastIndexOf('i');
		System.out.println(s2);
		String s1=s.intern();
		System.out.println(s1==s);
		byte[] b=s.getBytes();
		for(byte n:b) {
			System.out.println(n);
		}
		char[] x=s.toCharArray();
		String f=new String(x);
		for(char l:x) {
			System.out.println(l);
		}
		
		

	}

}
