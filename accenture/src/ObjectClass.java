import java.lang.reflect.Method;
//
public class ObjectClass {
	static void m1() {
		//System.out.println("hai");
	}

	public static void main(String[] args) {
		try {
			/*//ObjectClass f=new ObjectClass();
			m1();
		Class c=Class.forName("java.lang.Object");
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1.getName());
		}
		 */
			Object c=new ObjectClass();
			Class d=c.getClass();
			System.out.println(d.getName());
			Method[] m=d.getDeclaredMethods();
			for(Method m1:m) {
				System.out.println(m1.getName());
			}
			//ObjectClass j=new ObjectClass();
			m1();
			m2();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	static void m2() {
		// TODO Auto-generated method stub
		
	}

}
