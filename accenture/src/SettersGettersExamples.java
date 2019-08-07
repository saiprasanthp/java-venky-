//setters and getters examples 
public class SettersGettersExamples {
	private String name;
	private int salary;
	private int amount;
	public String setName(String name) {
		return this.name=name;

	}public String getName() {
		System.out.println("your name is changed");
		return name;
	}
	public int setSalary(int salary) {
		return this.salary=salary;

	}public int getSalary() {
		return salary;
	}
	public int getAmount() {
		return amount+salary;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public static void main(String[] args) {
		SettersGettersExamples d=new SettersGettersExamples();
		d.setName("sai");
		String s=d.getName();
		System.out.println(s);
		d.setSalary(3000);
		int s1=d.getSalary();
		System.out.println(s1);
		d.setAmount(900);
		int s2=d.getAmount();
		System.out.println(s2);
	}	
}
