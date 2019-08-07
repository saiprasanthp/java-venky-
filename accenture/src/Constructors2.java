//constructors demo
class Constructors11{
	int a;
	String name;
	static String college="gist";
	
	Constructors11(int a,String name){
		this.a=a;
		this.name=name;
		}
	Constructors11(int a,String name,String college){
		this(a,name);
		//this.college=college;
		}
	void display(){
		System.out.println(a+" "+name+" "+college);	
	}	
}
public class Constructors2 {
	public static void main(String[] args) {
		Constructors11 d=new Constructors11(101,"sai");
		Constructors11 d1=new Constructors11(102,"manu","gist");
		Constructors11 d2=new Constructors11(103,"kotha");
		d.display();
		d1.display();
		d2.display();
	}
}
