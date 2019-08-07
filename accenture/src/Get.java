//has_a relationship
class Address33{
	String city;
	String village;
	Address33(String city,String village){
		this.city=city;
		this.village=village;
		
	}
}
class Get{
	Address33 b;
	int roll_no;
	String name;
	Get(Address33 b,int roll_no,String name){
		this.b=b;
		this.roll_no=roll_no;
		this.name=name;	
	}

void display() {
	System.out.println(roll_no+name+"="+b.city+"  "+b.village);
}

	public static void main(String[] args) {
		Address33 d=new Address33("nellore","gudipallipadu");
		Get b=new Get(d,101,"sai");
		b.display();
		
		

	}

}
