//is_a_relation
class Hello11{
	static int a=10;
	void m3(){
		System.out.println("hello3");
	}
}
class Hello1 extends Hello11{
	static int a=30;
	static String college;
	void m1(){
		int n=10;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.println("even"+i);
			}else{
				System.out.println("odd"+i);
			}
		}
		System.out.println("hello");
	}
	void m3() {
		System.out.println("hello2");
	}	
	static void m4() {
		college="gist";
	}
	void display() {
		System.out.println(college);
	}
}
public class ISaRelation2{
	public static void main(String[] args){
		//Hello11 f=new Hello11();
		Hello1 d=new Hello1();
		d.m1();
		//d.m2();
		d.m3();
		Hello1.m4();
		d.display();
		System.out.println(Hello11.a);
		System.out.println(Hello1.a);

	}
}
