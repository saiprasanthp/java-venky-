//string practise
public class StringPractise1 {

	public static void main(String[] args) {
		/*String b="Hello this is java class";
		byte[] d=b.getBytes();
		//System.out.println(d);
		String x=new String(d);
		//char i=x.charAt(0);
		for(int k=0;k<x.length();k++) {
			System.out.println(x.charAt(k));
		}
		//System.out.println(i);
		//System.out.println(x);
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]);
		}
		
		String h="jai";
	char[]	g=h.toCharArray();
	System.out.println(g);
	for(char d1:g) {
		System.out.println(d1);
	}
	String j="fskslalxlmxls";
	try {
	for(int i=0;i<j.length();i++) {
		System.out.print(j.charAt(i));
	}
	}catch(Exception e) {
		e.printStackTrace();
	}*/
	String q=new String("HELLO");
	String h1="hello";
	//System.out.println(q.compareTo(h1));
	int d1=q.compareTo(h1);
	System.out.println(d1);
	System.out.println(q==h1);
	System.out.println(q.equalsIgnoreCase(h1));
	String name="hai";
	String g1=String.format("value of %h", 31.23);
	String g2=String.format("value of %s",name);
	System.out.println(g2);
	System.out.println(g1);
	System.out.println(h1.lastIndexOf("e"));
	String z="hello";
	int l=90;
	String v=z.valueOf(l);
	System.out.println(v+l);
		
	}

}
