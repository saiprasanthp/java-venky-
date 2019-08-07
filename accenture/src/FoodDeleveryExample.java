//food deliver example
public class FoodDeleveryExample {
	private String item;
private	String cost;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item=item;
	}
	public String getCost() {
		return cost;
	}public void setCost(String cost) {
		this.cost=cost;	
	}
	public static void main(String[] args) {
		FoodDeleveryExample d=new FoodDeleveryExample();
		d.setItem("chapathi");
		String f=d.getItem();
		System.out.println(f);
		d.setCost("70");
		String f1=d.getCost();
		System.out.println(f1);
	}
}
