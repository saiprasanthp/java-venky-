//has_a relationship example
class Has{
	private long salary;
	private String name;
	public void setSalary(long salary){
		this.salary=salary;
	}
	public Long getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Employee21{
	Has d1;
	public Employee21(Has d1) {
		this.d1=d1;
	}
	void salary() {
	d1.setSalary(10000l);
	d1.setName("sai");
	}
}
public class Has_aRelation8 {
	public static void main(String[] args) {
		Has d1=new Has();
		Employee21 g=new Employee21(d1);
		g.salary();
		//System.out.println(d1.getSalary());
		//System.out.println(d1.getName());
		long salary=d1.getSalary();
		System.out.println(salary);
		
	}

}
