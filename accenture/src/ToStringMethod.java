//overriding toString() method
public class ToStringMethod {
	int rollno;
	String name;
	String city;
	ToStringMethod(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		
	}
	public String toString() {
		return rollno+" "+name+" "+city;
	}

	public static void main(String[] args) {
		ToStringMethod s1=new ToStringMethod(101,"sai","nellore");
		ToStringMethod s2=new ToStringMethod(102,"manu","nellore1");
		ToStringMethod s3=new ToStringMethod(103,"hello","world");           
		System.out.println(s1);                                 //without using any another mthod we can directly call
		System.out.println(s2);
		System.out.println(s3);
		
		

		


	}

}
