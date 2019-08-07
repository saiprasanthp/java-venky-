import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//reversing String 
public class ReversingString {
	

	public static void main(String[] args) throws IOException {
		//ReversingString f=new ReversingString();
	/*	byte[] b= {97,98,99,100};
		String s=new String(b);
		System.out.println(s);*/
		
		
		FileInputStream j=new FileInputStream("F:\\jai.txt");
		//String s1="java";
		//j.read();
		String s2="hello";
		byte[] n=s2.getBytes();
		j.read(n);
		System.out.println(j.read(n));
		
		
		
		
		//byte[] c=s1.getBytes();
		/*char[] x=s1.toCharArray();
		//System.out.println(x);
		for(int i=x.length;i>0;i--) {
			System.out.println(x[i-1]);
		}*/
		

		
		
		

	}

}
