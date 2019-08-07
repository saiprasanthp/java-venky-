//user define immutable creation
final public class UserImmutable {
	private int a;
	UserImmutable(int a){
		this.a=a;
		
		
	}
	public UserImmutable modify(int i) {
		if(this.a==a) {
			return this;
			
		}else {
			return (new UserImmutable(i)); 
		}
	}

	public static void main(String[] args) {
		UserImmutable d=new UserImmutable(10);
		UserImmutable d1=d.modify(100);
		UserImmutable d2=d.modify(10);
		System.out.println(d);

	System.out.println(d1);
		System.out.println(d2);


	}

}
