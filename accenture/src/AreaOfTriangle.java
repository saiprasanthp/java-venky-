//area of triangle by using method
class Triangle{
	int length;
	int breadth;
	void areaOfTriangle(int l,int b) {
		length=l;
		breadth=b;
		
	}
	
	void display() {
		System.out.println("area of tiangle="+length*breadth);
	}
}
public class AreaOfTriangle {

	public static void main(String[] args) {
		Triangle d=new Triangle();
		Triangle d1=new Triangle();
		d.areaOfTriangle(20,30);
		d1.areaOfTriangle(1, 2);
		d.display();
		d1.display();
		

	}

}
