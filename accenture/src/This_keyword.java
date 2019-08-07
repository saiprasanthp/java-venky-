//has_arelation
public class This_keyword {
	void m2(This_keyword g) {
		System.out.println("enter name");
	}
	This_keyword m1() {
		return this;
	}	
	public static void main(String[] args) {
		This_keyword j=new This_keyword();
		j.m2(j);
	}

}
