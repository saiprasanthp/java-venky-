//lastIndexOf
public class LastIndexOf {

	public static void main(String[] args) {
		//lastIndexOf
		String s="hello worldowo" ;
		int a=s.lastIndexOf('o');
		System.out.println(a);
		
	   int b=s.lastIndexOf("wo");
	   System.out.println(b);
	   
	   
	   int c=s.lastIndexOf('o', 13);
	   System.out.println(c);
	   
	   int d=s.lastIndexOf("ldowo", 10);
	   System.out.println(d);
	   
	   String s1="hello world";
	   String[] s7=s1.split("\\s");
	   for(String z:s7) {
		   System.out.println(z);
	   }
	   
	   //replace methods 
	   String s9=s.replace('o', 'l');
	   System.out.println(s9);
	   
	   String s10=s.replace("hello", "java");
	   System.out.println(s10);
	   
	   String s11=s.replaceAll("\\s", "&&");
	   System.out.println(s11);
	   
	   String s12=s.replaceFirst("\\s", "whatsapp");
	   System.out.println(s12); 
	   
	   //substring method
	   String s13=s.substring(2);
	   System.out.println(s13);
	   
	   String s14=s.substring(3, 8);
	   System.out.println(s14);
	   
	   //valueOf
	   int w=10;
	   String s16=String.valueOf(w);
	   System.out.println(s16+20);
	   String s17=new String(String.valueOf(w));
	   System.out.println(s17);
	   
	   
	   float g=12.12f;
	   String s18=String.valueOf(g);
	   System.out.println(s18);
	   
	   
	   double f=10.88;
	   String s19=String.valueOf(f);
	   System.out.println(s19); 
	   
	  // toCharArray method
	   String h="javatpoint";
	   char[] x=h.toCharArray();
	   for(char j:x) {
		   System.out.println(j);  
		   
	   }  
	   
	}

}
