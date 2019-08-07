//ConstructorExample
public class ConstructorExample {
	int roll_no;
	String name;
	String name1;
	ConstructorExample(int i,String s,String e ){
		roll_no=i;
		name=s;
		name1=e;
		System.out.println(roll_no+name+name1);
	}
	ConstructorExample(ConstructorExample d){
		roll_no=d.roll_no;
		name=d.name;
		name1=d.name1;
		
		
	}
	void display() {
		System.out.println(roll_no+name+name1);
	}
	

	public static void main(String[] args) {
		ConstructorExample c=new ConstructorExample(101,"arjun","gist");
		ConstructorExample c1=new ConstructorExample(c);
		c1.display();

	}

}
