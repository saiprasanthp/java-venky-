//Bestexample for has_aexample
class Address0{
	String city;
	String rollno;
	Address0(String city,String rollno){
		this.city=city;
		this.rollno=rollno;
	}
}
class Student{
	Address0 k;
	Student(Address0 k) {
		this.k=k;
	}
	void display() {
		System.out.println(k.city+k.rollno);
	}
}class Hero{
	Address0 k;
	Hero(Address0 k){
		this.k=k;		
	}
	void display() {
		System.out.println(k.city+k.rollno);
	}	
}
public class Has_aRelation6 {
	public static void main(String[] args) {
		Address0 h=new Address0("ap","101");
		Student n=new Student(h);
		Hero p=new Hero(h);
		n.display();
		p.display();		
	}

}
