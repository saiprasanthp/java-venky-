//reversing string to char and char to string
public class String_char_String {
	String s2="";
	String s3="";
	char[] f;
	char[] c;
	void returnString() {
	String s="java";
	 f=s.toCharArray();
	for(int i=0;i<f.length;i++) {
		 s2=s2+f[i];
	}
	System.out.println("converting char[] to string:"+s2);
	}
	void byteArray() {
		String s="welcome to java class";
		byte[] b=s.getBytes();
		int len=b.length;
		for(int i=len;i>0;i--) {
			s3=s3+b[i-1];	
		}
		String f=new String(s3);
		System.out.println(f);
	}
	public static void main(String[] args) {
		String_char_String d=new String_char_String();
		d.returnString();
		d.byteArray();

	
	}
}
