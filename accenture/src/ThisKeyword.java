//thiskeyword example
public class ThisKeyword {
	int roll_no;
	String name;
	String city;
	ThisKeyword(int roll_no,String name,String city){
		this.roll_no=roll_no;
		this.name=name;
		this.city=city;
		
	}
	void display() {
		this.m2();
		System.out.println(roll_no+" "+name+"" +" "+city);
	}
	void m2() {
		System.out.println("this is method calling using this keyword");
	}

	public static void main(String[] args) {
		ThisKeyword d=new ThisKeyword(101,"sai","nellore");
		ThisKeyword d1=new ThisKeyword(102,"ramu","nlr");
		d.display();
		d1.display();
		

	}

}
