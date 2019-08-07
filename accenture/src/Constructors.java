//constructors assiging without using constructor
class Assign{
	int roll_no;
	String name;
	Assign(int i,String c){
		roll_no=i;
		name=c;
		
	}
	Assign(){
	}
		void display() {
		System.out.println(roll_no+name);
		}
	
}
public class Constructors {

	public static void main(String[] args) {
		Assign d=new Assign(101,"hello");
		Assign d1=new Assign();
		d1.roll_no=d.roll_no;
		d1.name=d.name;
		d.display();
		d1.display();
		
		

	}

}
