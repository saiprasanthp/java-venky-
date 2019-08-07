//average in an array
public class Average_in_a_Array {
	int id;
	String name;
	
	public void m1(int id,String name) {
		this.id=id;
		this.name=name;
		
		
	}
	public String toString() {
		return name+id;
	}
	public void m2(int id,String name) {
		this.id=id;
		this.name=name;
		
	}

	public static void main(String[] args) {
		int a=0;
		int[] d= {10,20,30,40,50};
		for(int i=0;i<d.length;i++) {
			 a=a+d[i];	
		}
		System.out.println(a/d.length);
		Average_in_a_Array k=new Average_in_a_Array();
		k.m1(101,"sai");
		System.out.println(k.id);
		System.out.println(k.name);
		System.out.println(k);
		k.m2(102,"manu");
		
		
	}

}
