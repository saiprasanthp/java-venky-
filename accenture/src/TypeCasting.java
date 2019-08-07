//typeCasting examples
public class TypeCasting {
	void typeCasting() {
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		int v=200;
		short x=(short)v;
		System.out.println(x);
		System.out.println(b+"+"+s+"+"+i+"+"+l+"+"+f+"+"+d);
	}

	public static void main(String[] args) {
		TypeCasting d=new TypeCasting();
		d.typeCasting();
		

	}

}
