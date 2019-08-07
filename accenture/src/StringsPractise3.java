//Strings examples
class Parent{
	private String name;
	private String gmail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail=gmail;
	}	
}class Child extends Parent{
	public void m1() {
		System.out.println("haiii");	
	}
	static {
		System.out.println("hiiii nellore");
	}
	static {
		System.out.println("gud mng");
	}
}
public class StringsPractise3 {
	public static void main(String[] args) {
		Child d=new Child();
		d.setName("sai");
		System.out.println(d.getName());
		d.setGmail("sai@gmail.com");
		System.out.println(d.getGmail());
		d.m1();
		String s="sai";
		char[] f=s.toCharArray();
		for(int i=f.length;i>0;i--) {	
			System.out.println(f[i-1]);
 }	
 		}
}
