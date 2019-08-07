//some thing to be return examples
public class ReturningExamples {
	ReturningExamples message() {
		return this;                                         //return this refers to class object
	}
	ReturningExamples  m1(ReturningExamples d) {
		return this;		
	}
	void a() {
		m1(this);
		System.out.println(this);                              //this indicates the class object so d value and this value is same
		System.out.println(this);                              //this indicates the address of class object
		System.out.println("this is covarient return type");
	}
	
	

	public static void main(String[] args) {
		ReturningExamples d=new ReturningExamples();
		System.out.println(d);                                  //we are printing the address of d
		d.message();
		d.a();
		
		

	}

}
