
public class CompareTo {

	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		String s2="orld";  
		int i=s.compareTo(s1);
		System.out.println(i);
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String s4=new String("hello");
		String s5=new String("hello");
		System.out.println(s4.equals(s5));
		System.out.println(s4==s5);
		String sf1=String.format("name is %s",s);
	System.out.println(	sf1.format(s5, "hello"));

	}

}
