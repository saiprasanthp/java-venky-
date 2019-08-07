//coping values without using constructor
public class Constructors22 {
	Constructors22 f;
	int roll_no;
	String name;
	Constructors22(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;	
	}
	public Constructors22() {
	}
	Constructors22(Constructors22 f){
		this.f=f;
		roll_no=f.roll_no;
		name=f.name;
	}
	void display() {
		System.out.println(roll_no+name);
	}
	public static void main(String[] args) {
		Constructors22 d=new Constructors22(101,"sai");
		Constructors22 d1=new Constructors22();
		d1.roll_no=d.roll_no;
		d1.name=d.name;
		Constructors22 d2=new Constructors22(d);
		d.display();
		d1.display();
		d2.display();
	}

}
