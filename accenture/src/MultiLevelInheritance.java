//wap on multilevelInheritance
class Dog{
	int a=10;
	int b=90;
	void dog() {
		System.out.println("it is barking");
	}
}
class Horse extends Dog{
	void horse() {
		System.out.println("it is running");
	}
}
class Hen extends Horse{
	void hen() {
		System.out.println("hen is leying eggs");
		System.out.println(a);
		System.out.println(b);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Hen h=new Hen();
		h.dog();
		h.horse();
		h.hen();
	}
}
