//example of passing an address object to employee
class Ad_dress{
	String roll;
	String name;
	 Ad_dress(String roll, String name) {
		this.roll=roll;
		this.name=name;
	}
	 void m1() {
		 System.out.println("hai");
	 }
}class Em_ployee {
	Ad_dress d;
	String name;
	Em_ployee(Ad_dress d) {
		this.d=d;
 	}
}
public class Address_Employee { 

	public static void main(String[] args) {
		Ad_dress ad=new Ad_dress("101","mahesh");
		Em_ployee em=new Em_ployee(ad);
		//System.out.println(em);
		System.out.println(em.d.roll);
		System.out.println(em.d.name);
		em.d.m1();
		
	}
}
