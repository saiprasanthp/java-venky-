//stringexample
public class StringExample1 {
	public static void main(String[] args) {
		String s="hello";
		String s1=s.toUpperCase();
		System.out.println(s==s1);
		StringBuffer d=new StringBuffer(s);
		System.out.println(d);
		//System.out.println(d.capacity());
		d.append("i");
		System.out.println(d.capacity());
		String name="sai";
		System.out.println(name);
		StringBuffer ab=new StringBuffer("jnadksn");
		ab.ensureCapacity(100);
		System.out.println(ab.capacity());
	ab.trimToSize();
	System.out.println(ab.capacity());
		
		
	}
}
