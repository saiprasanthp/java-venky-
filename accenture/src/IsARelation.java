//wap on IsARelation on method overriding
class Dog1{
	void dog() {                         //this is parent class
		System.out.println("dog");
	}
}
class Horse1 extends Dog1{
	void dog() {                        //method dog() overridden from the parent class
		System.out.println("horse");
	}
}
class Hen1 extends Dog1{
	void dog() {                        //method dog() overridden from parent class 
		System.out.println("hen"); 
	}
}
public class IsARelation {

	public static void main(String[] args) {
		Hen1 d=new Hen1();
		d.dog();                          //method is override
		d.dog(); 
		d.dog();
		Horse1 b=new Horse1();           //created a new object for Horse1 class
		b.dog();                         //method is called using that reference
	}
}
