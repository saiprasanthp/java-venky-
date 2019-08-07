//overriding example
class Unit{
	String name;
	public void validate(String name) {
		this.name=name;
	}
}class Unity extends Unit{
	public void validate(String name) {
		this.name=name;
		this.validate2(name);
		System.out.println(name);
	}
	public void validate2(String name) {
		System.out.println(name);
	}
	public int validate() {
		return 10;
	}	
}
public class OverRiding {

	public static void main(String[] args) {
		Unity d=new Unity();
		d.validate("sai");
		int s=d.validate();
		System.out.println(s);
	}
}
