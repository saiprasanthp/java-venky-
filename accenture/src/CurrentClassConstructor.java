//calling current class constructor
class Constructor22{
	int a;
	Constructor22(int x){
		this();
		a=x;
		System.out.println(a);
		
	}
	Constructor22(){
		System.out.println("helloworld");
	}
	
}
public class CurrentClassConstructor {

	public static void main(String[] args) {
		Constructor22 d=new Constructor22(10);

	}

}
