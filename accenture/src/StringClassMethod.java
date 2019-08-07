//stringclass method
public class StringClassMethod {

	public static void main(String[] args) {
		//toUpperCase
		String s="sachin";
		String s1=s.toUpperCase();      
		System.out.println(s1);
		
		//System.out.println(s);
		
		//toLowerCase
		String s2="SACHIN";
		System.out.println(s2.toLowerCase());
		
		  //trim 
		String s3="    sachin    ";
		System.out.println(s3);
		System.out.println(s3.trim()); 
		
		
		
		//startsWith()
		String s4="sachin";
		System.out.println(s4.startsWith("sa"));
		
		//endsWith()
		String s5="sachin";
		System.out.println(s5.endsWith("n"));
		
		//charAt()
		String s6="sachin";
		System.out.println(s6.charAt(1));
		System.out.println(s6.charAt(3));
		
		
		
		//length()
		String s7="sachin";
		System.out.println(s7.length());
		
		//intern()
		String s8=new String("welcome");
		String s9=s8.intern();
		System.out.println(s9);
		
		
		//valueof()
		int a=20;
		String s10=String.valueOf(a);
		System.out.println(s10+10);
		
		
		
		
		
		
		
		
		
		
		

	}

}
