//constructor example
class Construct12{
	int a;
	String name;
	String college;
	int b;
	Construct12(int a,String name,String college){
		this.a=a;
		this.name=name;
		this.college=college;
	}
	Construct12(Construct12 f,int b){
		a=f.a;
		name=f.name;
		college=f.college;
		this.b=b;
	}Construct12(Construct12 d){
		a=d.a;
		name=d.name;
		college=d.college;
	}
	
	void display() {
		System.out.println(a+" "+name+" "+college+b);
	}
}
public class Constructor12 {
	public static void main(String[] args) {
		Construct12 d1=new Construct12(101,"sai","gist");
		Construct12 d2=new Construct12(d1,121);
		Construct12 d3=new Construct12(101,"sai","gist");
		Construct12 d4=new Construct12(d3);
		d1.display();
		d2.display();
		d3.display();
		d4.display();
	}
}
