import java.lang.*; 
public class Consruecor2 {
	String name;
	int rno;
	static String college="gist";
	Consruecor2(String name,int rno){
		this.name=name;
		this.rno=rno;
		System.out.println(name); 
		System.out.println(rno);
	}
	void display() {
		System.out.println(name+rno+college);
	}
	public String toString() {
		return "hello";
	}
	

	public static void main(String[] args) {
		System.out.println(college);
		Consruecor2 s1=new Consruecor2("durga",101);
		Consruecor2 s2=new Consruecor2("sai",102);
		s1.display();
		s2.display();
		System.out.println(s1);
		System.out.println(s2);
	}

}
