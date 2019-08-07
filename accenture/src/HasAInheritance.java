//has a inheritance 
class Address{
	String city;
	String state;
	String country;
	Address(String city,String state,String country){
		this.city=city;
		this.state=state; 
		this.country=country;	
	}
	/*void display() {
		System.out.println(roll_no+" "+name+" "+college+" "+college2);
		System.out.println(a1.city+" "+a1.state+" "+a1.country);
	}*/
}
class Empty{
	int roll_no;
	String name;
	String college;
	Address a1;
	Address a2;
	private static String college2="gite";
	Empty(int roll_no,String name,String college,Address a1){
		this.roll_no=roll_no;
		this.name=name;
		this.college=college;
		this.a1=a1;
	}
	void display() {
		System.out.println(roll_no+" "+name+" "+college+" "+college2);
		System.out.println(a1.city+" "+a1.state+" "+a1.country);
	}
}
	public class HasAInheritance {
	public static void main(String[] args) {
		Address a1=new Address("nellore","ap","india");
		Address a2=new Address("nellore rural","ap","india");
		Empty e1=new Empty(101,"sai","gist",a1);
		Empty e2=new Empty(102,"manu","gist",a2);
		e1.display();
		e2.display();
	}
}
