//practise program on final keyword
class Bike22{
	//final int a=10;
	final void m1() {
		int a=20;
	}
}
final class Bell extends Bike22{
	
}

public class Final_Keyword extends Bike22{
	final int b;//blank final variable
	Final_Keyword(){
		  b=10;	   //blank final variable is initialized only in constructor
	}
	
	public static void main(String[] args){   
		Final_Keyword d=new Final_Keyword();

	}

}
         //some important points on final keyword
/**final keyword is applicable to variables,methods,class.
*blank final variables should be initialized only in constructor 
*if class is final it can not be extends by childclass
*if subclass is final and it can be extends parent class
*if a method is final we can not override it if so it will through compile time error
*final blank variables=variables which are not assigned a value 
*can a constructor be final ?
*answer:--)no...because a constructor can not be inherited
*
*/