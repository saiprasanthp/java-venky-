//constructorChecking
public class ConstructorChecking {
	int a;
	String name;
	String name1;
	int b;
	ConstructorChecking(int a,String name,String name1){
		this.a=a;
		this.name=name;
		this.name1=name1;	
	}
	ConstructorChecking(int a,String name,String name1,int b){
		this(a,name,name1);                                      //this is used here                        
		this.b=b;
	}void display1(){
		System.out.println(a+name+name1);}       
		
	void display2() {
		System.out.println((a+name+name1+b));
	}

	public static void main(String[] args) {
		ConstructorChecking d1=new ConstructorChecking(101,"sai","hello");
		ConstructorChecking d2=new ConstructorChecking(102,"manu","jai",101);
		d1.display1();
		d2.display2();

	}

}
