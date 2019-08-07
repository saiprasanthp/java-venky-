
//example of method
class Parent5 
{
	public void m1(int i) throws Throwable                          // Exception              //     Exception
	{
		System.out.println(i);
	}
}
 class Child6 extends Parent5{
   public void m1(int i) throws  Throwable                     //Exception               //FileNotFoundException
   {
		System.out.println(i);
	}
}
public class MethodLoading1 {
	public static void main(String[] args) throws  Throwable {               // Exception             /*FileNotFoundException*/   {
		Child6 d=new Child6();
		d.m1(10);
		 
		/*Parent5 f=new Parent5();
		f.m1(10);
		
		Parent5 k=new Child6();
		k.m1(90);*/
		

	}

}
