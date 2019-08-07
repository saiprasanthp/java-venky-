//example of a singleton class
class Single{
	private static Single g=new Single();
	private Single() {
		
	}
	public static Single getSingle() {
		return g;
	}
	
}class Double {
	
}
class Third extends Double{
	

	
}
public class SingletonClasses {

	public static void main(String[] args) {
		Third f=new Third();
		Single k=Single.getSingle();
		System.out.println(k);


	}

}
