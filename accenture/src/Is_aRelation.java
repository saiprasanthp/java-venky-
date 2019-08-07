class A33{
	int rollno;
	String name;
	A33(){
		this.rollno=101;
		this.name="ravi";
		/*System.out.println(rollno);
		System.out.println(name);	*/
	}
}class B33 extends A33{
	int rollno;
	String name;
	B33(){ 
		this.rollno=102;
		this.name="subbu";	
		/*System.out.println(super.rollno);
		System.out.println(super.name);*/
	}	
}
public class Is_aRelation { 
	public static void main(String[] args) {
		B33 d=(B33)new A33();
		System.out.println(d.rollno);
		System.out.println(d.name); 
	}
}
