//example
public class Static {
	int a;
	String name;
	String name2;
	String college2="gello";
	Static(int a,String name,String name2)
	{
		this.a=a;
		this.name=name;
		this.name2=name2;
	}
	public String toString() {
		StringBuffer college=new StringBuffer("gist");
		StringBuffer e=college.reverse();
		System.out.println(college.append("helllo"));
		System.out.println(college.replace(1, 2, "kilo"));
		System.out.println(college.delete(1, 4));
		return a+" "+name+" "+name2+" "+college+" "+college2;
	}

	public static void main(String[] args) {
		Static  d=new Static(101,"hello"," kite");
		Static d2=new Static(101,"hello1","kite1");
		Static d3=new Static(101,"hello1","kite1");
		Static d4=new Static(101,"hello1","kite1");
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}
