//************writing a hashCode() Example and toString() method Example**********************
public class HashCode {
	int rollno;
	String name;
	HashCode(int rollno,String name){
		this.rollno=rollno;
		this.name=name;	
	}
	//********toString()******implementation**********
	public String toString() {
		return rollno+name;
	}
	//*************hashCode() implementation**********
	public int hashCode() {
		return 100;
	}

	public static void main(String[] args) {
		HashCode d=new HashCode(101,"sai");
		//System.out.println(d);//HashCode@15db9742 
		//System.out.println(d);//101sai
		HashCode d2=new HashCode(101,"jai");
		System.out.println(d);//HashCode@64
   System.out.println(d2);//HashCode@64

		
		
		

	}

}
