//example of TightlyEncapsulatedClass
public class TightlyEncapsulatedClass {
	 private String name;
	private String name1;
	private String name2;
	public void setName(String name) {
		 this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setName1(String name1) {
		this.name1=name1;
	}
	public String getName1() {
		return name1;
	}
	public void setName2(String name2) {
		this.name2=name2;
	}
	public String getName2() {
		return name2;
	}

	public static void main(String[] args) {
		TightlyEncapsulatedClass d=new TightlyEncapsulatedClass();
		d.setName("hai");
		System.out.println(d.getName());
		d.setName("bye");
		System.out.println(d.getName());
		d.setName("hello");
		System.out.println(d.getName());
	}

}
